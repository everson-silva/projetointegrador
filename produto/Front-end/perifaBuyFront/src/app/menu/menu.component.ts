import { Component, OnInit } from '@angular/core';
import { Produto } from '../model/Produto';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  produto:Produto = new Produto

  constructor() { }

  ngOnInit() {
  }

  pesquisarProduto(){

  }
}
