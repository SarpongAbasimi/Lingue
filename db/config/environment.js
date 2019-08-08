exports.whichDB = ()=>{
  if(process.env.NODE_ENV !== 'development'){
    return process.env.TEST_DB
  }else {
    return process.env.MONGO_DB_URI
  }
}
