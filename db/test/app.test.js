const app = require('../server'),
request = require('supertest');

describe('GET/', ()=> {
  it('must say hello', (done)=> {
    request(app)
    .get('/')
    .expect('Content-Type', /html/)
    .expect(200)
    .expect(/Welcome to the home page/, done);
  });
});

describe('Post', ()=> {
  it('can post data to a route', (done)=>{
    request(app)
    .post('/')
    .send({ name: 'chris'})
    .expect(200,{
      name: 'chris'
    }, done)
  });
});