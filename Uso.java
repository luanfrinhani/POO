package prova;

import prova.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Uso {

	public static void main(String[] args) {
		Agenda itens = new Agenda();
		String registro, descricao, local;
		DataCalendario dataIn, dataFim;
		int op = 1, diaIn, mesIn, anoIn, diaFim, mesFim, anoFim, horaIn,minIn,segIn, horaFim,minFim,segFim;
		int prioridade, minutos, ver = 0;
		Horario horarioIn,horarioFim;
		Periodo periodo = null;
		Evento evento = null;
		Meta meta = null;
		Lembrete lembrete = null;
		while (op!=0) {
			System.out.println("1 - Adicionar um evento\n2 - Adicionar uma meta\n3 - Adicionar um lembrete\n"+ "4 - Exibir todos os itens da agenda\n5 - Exibir todos os itens em um intervalo de data\n"+ "6 - Exibir as metas em ordem de prioridade\n7 - Exibir lembretes por minutos de antecedencia\n"
					+ "8 - Exibir eventos por ordem de local\n9 - Salvar agenda em disco\n10 - Recuperar agenda do disco\n"+ "0 - Sair\n");
			op = new Scanner(System.in).nextInt();
			if (op == 1) {
				System.out.println("Entre com um registro ");
				registro = new Scanner(System.in).nextLine();
				System.out.println("Entre com a descricao: ");
				descricao = new Scanner(System.in).nextLine();
				System.out.println("Entre com o local: ");
				local = new Scanner(System.in).nextLine();
				while (true) {
					ver = 0;
					while (true) {
						System.out.println("Entre com a data de inicio do evento");
						
						diaIn = new Scanner(System.in).nextInt();
						mesIn = new Scanner(System.in).nextInt();
						anoIn = new Scanner(System.in).nextInt();
						try {
							dataIn = new DataCalendario(diaIn,mesIn,anoIn);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida");
						}
					}
					while (true) {
						System.out.println("Entre com a data de termino do evento");
						diaFim = new Scanner(System.in).nextInt();
						mesFim = new Scanner(System.in).nextInt();
						anoFim = new Scanner(System.in).nextInt();
						try {
							dataFim = new DataCalendario(diaFim,mesFim,anoFim);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida");
						}
					}
					if (DataCalendario.compareTo(dataIn, dataFim) == 1) {
						System.out.println("A data do inicio do evento deve ser anterior a do final");
					}
					else if (DataCalendario.compareTo(dataIn, dataFim) == 0) {
						ver++;
						break;
					}
					else {
						break;
					}
				}
				while (true) {
					while (true) {
						System.out.println("Entre com o horario de inicio do evento");
						horaIn = new Scanner(System.in).nextInt();
						minIn = new Scanner(System.in).nextInt();
						segIn = new Scanner(System.in).nextInt();
						try {
							horarioIn = new Horario(horaIn,minIn,segIn);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido");
						}
					}
					while (true) {
						System.out.println("Entre com o horario de termino do evento");
						horaFim = new Scanner(System.in).nextInt();
						minFim = new Scanner(System.in).nextInt();
						segFim = new Scanner(System.in).nextInt();
						try {
							horarioFim = new Horario(horaFim,minFim,segFim);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido");
						}
					}
					if (ver == 1 && Horario.compareTo(horarioIn, horarioFim) == 1) {
						System.out.println("Os horarios estao errados");
					}
					else {
						break;
					}
				}
				
				periodo = new Periodo(dataIn,dataFim,horarioIn,horarioFim);
				evento = new Evento(registro, descricao, periodo, local);
				itens.insereItem(evento);
			}
			else if (op == 2) {
				System.out.println("Entre com o nome do registro da meta: ");
				registro = new Scanner(System.in).next();
				System.out.println("Entre com a descricao da meta: ");
				descricao = new Scanner(System.in).next();
				while (true) {
					ver = 0;
					while (true) {
						System.out.println("Entre com a data de inicio da meta:");
						diaIn = new Scanner(System.in).nextInt();
						mesIn = new Scanner(System.in).nextInt();
						anoIn = new Scanner(System.in).nextInt();
						try {
							dataIn = new DataCalendario(diaIn,mesIn,anoIn);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida");
						}
					}
					while (true) {
						System.out.println("Entre com a data de termino da meta:");
						diaFim = new Scanner(System.in).nextInt();	
						mesFim = new Scanner(System.in).nextInt();	
						anoFim = new Scanner(System.in).nextInt();
						try {
							dataFim = new DataCalendario(diaFim,mesFim,anoFim);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida");
						}
					}
					if (DataCalendario.compareTo(dataIn, dataFim) == 1) {
						System.out.println("As datas estao incompativeis");
					}
					else if (DataCalendario.compareTo(dataIn, dataFim) == 0) {
						ver++;
						break;
					}
					else {
						break;
					}
				}
				while (true) {
					while (true) {
						System.out.println("Entre com o horario de inicio da meta: ");
						horaIn = new Scanner(System.in).nextInt();
						minIn = new Scanner(System.in).nextInt();
						segIn = new Scanner(System.in).nextInt();
						try {
							horarioIn = new Horario(horaIn,minIn,segIn);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido");
						}
					}
					while (true) {
						System.out.println("Entre com o horario de termino da meta:");
						horaFim = new Scanner(System.in).nextInt();
						minFim = new Scanner(System.in).nextInt();
						segFim = new Scanner(System.in).nextInt();
						try {
							horarioFim = new Horario(horaFim,minFim,segFim);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido");
						}
					}
					if (ver == 1 && Horario.compareTo(horarioIn, horarioFim) == 1) {
						System.out.println("Os horarios estao incompativeis");
					}
					else {
						break;
					}
				}
				
				periodo = new Periodo(dataIn,dataFim,horarioIn,horarioFim);
				while (true) {
					System.out.println("Entre com a prioridade da meta: ");
					prioridade = new Scanner(System.in).nextInt();
					try {
						meta = new Meta(registro, descricao, periodo, prioridade);
						break;
					} catch (Exception e) {
						System.out.println("Valor invalido");
					}
				}
				itens.insereItem(meta);
			}
			else if (op == 3) {
				ver = 0;
				System.out.println("Entre com o nome do registro do lembrete: ");
				registro = new Scanner(System.in).nextLine();
				System.out.println("Entre com a descricao do lembrete: ");
				descricao = new Scanner(System.in).nextLine();
				
				while (true) {
					while (true) {
						System.out.println("Entre com a data de inicio do lembrete:");
						diaIn = new Scanner(System.in).nextInt();
						mesIn = new Scanner(System.in).nextInt();
						anoIn = new Scanner(System.in).nextInt();
						try {
							dataIn = new DataCalendario(diaIn,mesIn,anoIn);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida");
						}
					}
					while (true) {
						System.out.println("Entre com a data de termino do lembrete:");
						diaFim = new Scanner(System.in).nextInt();
						mesFim = new Scanner(System.in).nextInt();
						anoFim = new Scanner(System.in).nextInt();
						try {
							dataFim = new DataCalendario(diaFim,mesFim,anoFim);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida");
						}
					}
					if (DataCalendario.compareTo(dataIn, dataFim) == 1) {
						System.out.println("As datas estao erradas");
					}
					else if (DataCalendario.compareTo(dataIn, dataFim) == 0) {
						ver++;
						break;
					}
					else {
						break;
					}
				}
				
				while (true) {
					while (true) {
						System.out.println("Entre com o horario de inicio do lembrete:");
						horaIn = new Scanner(System.in).nextInt();
						minIn = new Scanner(System.in).nextInt();
						segIn = new Scanner(System.in).nextInt();
						try {
							horarioIn = new Horario(horaIn,minIn,segIn);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido!!");
						}
					}
					while (true) {
						System.out.println("Entre com o horario de termino do lembrete:");
						horaFim = new Scanner(System.in).nextInt();
						minFim = new Scanner(System.in).nextInt();
						segFim = new Scanner(System.in).nextInt();
						try {
							horarioFim = new Horario(horaFim,minFim,segFim);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido");
						}
					}
					if (DataCalendario.compareTo(dataIn, dataFim) == 1) {
						System.out.println("As datas estao erradas");
					}
					if (ver == 1 && Horario.compareTo(horarioIn, horarioFim) == 1) {
						System.out.println("Os horarios estao errados");
					}
					else {
						break;
					}
				}
				periodo = new Periodo(dataIn,dataFim,horarioIn,horarioFim);
				while (true) {
					System.out.println("Entre com a quantidade de minutos de antecedencia para o alerta: ");
					minutos = new Scanner(System.in).nextInt();
					try {
						lembrete = new Lembrete(registro, descricao, periodo, minutos);
						break;
					} catch (Exception e) {
						System.out.println("Valor invalido");
					}
				}
				itens.insereItem(lembrete);
			}
			else if (op == 4) {
				System.out.println(itens.getItensDaAgenda());
			}
			else if (op == 5) {
				while (true) {
					while (true) {
						System.out.println("Entre com a data inicial do intervalo: ");
						diaIn = new Scanner(System.in).nextInt();
						mesIn = new Scanner(System.in).nextInt();
						anoIn = new Scanner(System.in).nextInt();
						try {
							dataIn = new DataCalendario(diaIn,mesIn,anoIn);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida");
						}
					}
					while (true) {
						System.out.println("Entre com a data final do intervalo: ");
						diaFim = new Scanner(System.in).nextInt();
						mesFim = new Scanner(System.in).nextInt();
						anoFim = new Scanner(System.in).nextInt();
						try {
							dataFim = new DataCalendario(diaFim,mesFim,anoFim);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida");
						}
					}
					if (DataCalendario.compareTo(dataIn, dataFim) == 1) {
						System.out.println("As datas estao invalidas");
					}
					else {
						break;
					}
				}
				System.out.println(itens.itensIntervalo(dataIn, dataFim));
			}
			else if (op == 6) {
				System.out.println(itens.informaMetasPrio().toString());
			}
			else if (op == 7) {
				System.out.println(itens.lembretesMinutos().toString());
			}
			else if (op == 8) {
				List<Evento> teste = new LinkedList<Evento>();
				teste = itens.eventosLocal();
				System.out.println(teste);
			}
			else if (op == 9) {
				try {
					BufferedWriter arqSaida;
					arqSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));  
					arqSaida.write(itens.toString()+"\r\n");
					arqSaida.close();
					
				} catch(FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				}
				catch(IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				}
				catch (Exception e) {
					e.getMessage();
				}
			}
			else if (op == 10) {
				try {
					BufferedReader arqEnt;
					arqEnt = new BufferedReader(new FileReader("C:\\Users\\Luan\\eclipse-workspace\\prova\\arquivo_de_saida.txt"));
					int i;    
			          while((i=arqEnt.read())!=-1)    
			          System.out.print((char)i);    
			          arqEnt.close();
					
				} catch(FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				}
				catch(IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				}
				catch (Exception e) {
					e.getMessage();
				}
			}
			else if (op == 0) {
				break;
			}
		}
	}
}

