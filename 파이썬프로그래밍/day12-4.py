# 예제 4
import numpy as np

n = int(input("n을 입력하시오 : "))
while n < 2:
    n = int(input("n을 입력하시오 : "))

a = (np.add.outer(np.arange(n), np.arange(n)) % 2 == 0).astype(int)
print(a)


# 최종 RAG Chain (LangChain Expression Language)

final_rag_chain = (
    # 1. 입력 및 Context 준비
    {
        "context": retriever_selector | RunnableLambda(rdb_fact_verifier), # 임베딩 모델에 따른 Retriever 선택 후 2차 검증
        "question": RunnablePassthrough(),
        "model_name": RunnablePassthrough(),
    }
    # 2. 프롬프트 증강
    | final_prompt_template
    # 3. LLM 동적 호출 (RunnableBranch)
    | llm_gateway_branch 
    # 4. 출력 후처리
    | custom_output_parser
)