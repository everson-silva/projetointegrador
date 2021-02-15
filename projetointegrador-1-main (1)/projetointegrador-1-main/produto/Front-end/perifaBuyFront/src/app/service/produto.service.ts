import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Produto } from '../model/produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  constructor(
    private http: HttpClient
  ){ }


  token = {headers: new HttpHeaders().set('Authorization', environment.token)} //autorização será atraves do enviroment. token - LARISSA


  getAllProdutos(): Observable<Produto[]>{
    return this.http.get<Produto[]>('http://localhost:8080/produto',this.token)
  }

  getByIdProduto(id: number):Observable<Produto>{
    return this.http.get<Produto>(`http://localhost:8080/produto/${id}`,this.token)
  }

}
