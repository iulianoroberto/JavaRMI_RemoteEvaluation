# JavaRMI_RemoteEvaluation
Implementation, with the support of Java RMI, of a variant of the client/server paradigm known with the term of Remote Evaluation.

Implement, with the support of Java RMI, a variant of the client/server paradigm known with the term of Remote Evaluation. Develop an Engine able to receive and run Tasks sent by clients. The Engine and the REV paradigm allow for distributing the execution of code fragments onto specialized machines (for example to exploit high performance hardware). Implement the Engine as a remote object and assume that the Engine does not know a priori the Tasks that it receives. Write a first task to perform the remote sum of two integers. Write a second task to perform the remote computation of the Fibonacci number of an integer number.

The REV paradigm is the basis of the AWS lambda used in the context of serverless computing.

## Spiegazione in italiano
Implementazione, tramite Java RMI, di una variante del paradigma client/server, nota come REV (remote evaluation). In questa applicazione è stato sviluppato un engine capace di ricevere ed eseguire task (oggetti remoti) inviati dai client. L'engine e il paradigma REV permettono l'esecuzione distribuita di frammenti di codice su macchine specializzate (ad esempio è utile per sfruttare hardware ad alte prestazioni).

L'engine (oggetto remoto) è stato implementato supponendo che lo stesso non conosca a priori il tipo di task da eseguire. Un primo task previsto è stato quello relativo alla somma di due interi, il secondo task previsto esegue il calcolo remoto del numero di Fibonacci dato un intero.

Il sorgente di Stub (lato lient) e Skeleton (lato server) è stato generato con il tool rmic (nota che il tool rmic è deprecato e la generazione degli stub avviene sfruttando la reflection).
