interface NameInterface {
  firstName: string;
  lastName: string;

}

export const name = (userName: NameInterface )=> {

  return(`${userName.firstName} ${userName.lastName}`)
}

const myObject = { firstName: 'hey', lastName: 'yes'}