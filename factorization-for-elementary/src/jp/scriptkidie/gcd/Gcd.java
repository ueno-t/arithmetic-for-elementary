package jp.scriptkidie.gcd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 連除法で最大公約数を求める。
 * 
 * @author ueno-t
 *
 */
public class Gcd {

	static List<Integer> primeList  = Arrays.asList(2,3,5,7,11,13,17,19);
	static List<Integer> resultList = new ArrayList<>();

	/**
	 * 連除法。
	 * 
	 * 連除法は下記手順で最大公約数を求めるアルゴリズムである。
	 * 
	 * 1. 1組の整数に共通する素数で約する（公約する）
	 *  - 最低2つに共通素数があるならば割っていく
	 *  - 共通素数がなくなったら終了
	 * 
	 * @param intList
	 * @return
	 */
	static Integer divisionAlgorithm(List<Integer> intList) {
		resultList.clear();
		getPrime(intList);
		return mulipleResult(resultList);

	}
	// 公約対象に公約可能な素数があるか探索する
	static List<Integer> getPrime(List<Integer> intList) {
		for (int prime : primeList) {
			if (isPledge(intList, prime)) {
				resultList.add(prime);
				return getPrime(divideByPrime(intList, prime));
			}		
		}
		return intList;
	}
	// 約せた場合に新たな公約対象を生成する
	static List<Integer> divideByPrime(List<Integer> intList, Integer prime) {
		return intList.stream().map(i -> i / prime).collect(Collectors.toList());
	}

	// 連除結果を返却する
	static Integer mulipleResult(List<Integer> resultList) {
		return resultList.stream().reduce(1,(x,y) -> x * y);
	}

	// 小さい素数から公約できるか試す
	static boolean isPledge(List<Integer> intList, Integer prime) {
		return intList.stream().allMatch(i -> i % prime == 0);
	}
}
