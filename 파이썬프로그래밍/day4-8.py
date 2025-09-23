s_list = ['abc', 'bcd', 'bcdefg', 'abba', 'cddc', 'opq']

short = s_list[0]

for i in range(1, len(s_list)):
    if len(s_list[i]) < len(short):
        short = s_list[i]

print(f"가장 길이가 짧은 문자열 : {short}")

long = s_list[0]

for i in range(1, len(s_list)):
    if len(s_list[i]) > len(long):
        long = s_list[i]

print(f"가장 길이가 긴 문자열 : {long}")

s_list.sort(key=len)

short_len = len(s_list[0])

short_list = []

for i in s_list:
    if len(i) == short_len:
        short_list.append(i)
    else:
        break

print(f"가장 길이가 짧은 문자열 : {short_list}")