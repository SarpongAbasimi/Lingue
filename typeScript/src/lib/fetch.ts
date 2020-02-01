const aPromise = <T>(): Promise<T> => {
  const url = "https://jsonplaceholder.typicode.com/posts/1"
  return fetch(url)
      .then(respose => {
          if (respose.status == 200) {
              console.log(respose.json())
              return respose.json()
          } else {
              throw new Error('These was a failure')
          }
      })
}