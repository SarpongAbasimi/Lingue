#!/usr/bin/env python3

from sys import argv

my_name = "chris"

print(f"He says his name is {my_name}")

types_of_people = 10
x = f"There are {types_of_people} types of people"
binary = "binary"
do_not = "don't"
y = f"Thosw who know {binary} and thise who {do_not}"

print(x)
print(y)

print(f"I said {x}")
print(f"I also said '{y}'")


print("----------------------------")
#string concatnation
name = 'sarp'
country = 'Lala'

print(f'{name} is from {country}')
print('This format is great too {}'.format(name))
print('.' * 5)

print('done')

print('name', end='')
print('another', end='')

print('How old are you?')
print('I am 6\'2')

#inpu = input('What is your name')
#age = input ('what is your age')

#print(f' good {inpu} and {age}')

first, second,  = argv

print(f'This first is {first}')
print(f'The secondis {second}')

print('----------------------------------')

user_input = input('Please type in your house number\n')

print(f'you typed {user_input}')

script, arandom_word = argv

print('The random word was {}'.format(arandom_word))


print('----------------------------------')

script, user_name = argv

prompt = '>'

print(f'Hey {user_name}')
print(f'I did like to ask you some few questions')
print('Do you like me {}'.format(user_name))

likes = input(prompt)


print(f'Where do you live {user_name}')

print('Reading from a file')

the_file = open('./a.txt')

print(the_file.read())

file_content = the_file.read()

print(file_content)
the_file.close()
