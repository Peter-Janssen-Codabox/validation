/**
 * core/get_position_of_last_delimiter_recursive.java
 *
 * This file was generated by MapForce 2017sp2.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package com.mapforce.core;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import com.altova.text.tablelike.*;
import com.altova.text.*;
import com.altova.text.edi.*;
import java.util.*;

public class get_position_of_last_delimiter_recursive extends com.altova.TraceProvider 
{

	
	static class main implements IEnumerable
	{
		java.lang.String var1_filepath;
		java.math.BigDecimal var2_pos;
		java.lang.String var3_delimiter1;
		java.lang.String var4_delimiter2;
	
		public main(java.lang.String var1_filepath, java.math.BigDecimal var2_pos, java.lang.String var3_delimiter1, java.lang.String var4_delimiter2)
		{
			this.var1_filepath = var1_filepath;
			this.var2_pos = var2_pos;
			this.var3_delimiter1 = var3_delimiter1;
			this.var4_delimiter2 = var4_delimiter2;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 2;
			Object current;
			main closure;
			public Enumerator(main closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 2:	if (moveNext_2()) return true; break;
					case 3:	if (moveNext_3()) return true; break;
					case 6:	if (moveNext_6()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_2() throws Exception {
				state = 0;				
				if (!(com.altova.functions.Core.equal(closure.var2_pos, new java.math.BigDecimal("0")))) {state = 3; return false; }
				current = new java.math.BigDecimal("0");
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if (!(com.altova.functions.Core.logicalOr(com.altova.functions.Core.equal(com.altova.functions.Core.substring(closure.var1_filepath, com.altova.CoreTypes.decimalToDouble(com.altova.functions.Core.subtract(closure.var2_pos, new java.math.BigDecimal("1"))), com.altova.CoreTypes.parseDouble("1")), closure.var3_delimiter1), com.altova.functions.Core.equal(com.altova.functions.Core.substring(closure.var1_filepath, com.altova.CoreTypes.decimalToDouble(com.altova.functions.Core.subtract(closure.var2_pos, new java.math.BigDecimal("1"))), com.altova.CoreTypes.parseDouble("1")), closure.var4_delimiter2)))) {state = 6; return false; }
				current = com.altova.functions.Core.subtract(closure.var2_pos, new java.math.BigDecimal("1"));
				pos++;
				return true;
			}
			private boolean moveNext_6() throws Exception {
				state = 0;				
				current = com.mapforce.core.get_position_of_last_delimiter_recursive.eval(closure.var1_filepath, com.altova.functions.Core.subtract(closure.var2_pos, new java.math.BigDecimal("1")), closure.var3_delimiter1, closure.var4_delimiter2);
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}



	// instances


	public static IEnumerable create(java.lang.String var1_filepath, java.math.BigDecimal var2_pos, java.lang.String var3_delimiter1, java.lang.String var4_delimiter2)
	{
		return new main(
			var1_filepath,
			var2_pos,
			var3_delimiter1,
			var4_delimiter2
			);

	}
	

	public static java.math.BigDecimal eval(java.lang.String var1_filepath, java.math.BigDecimal var2_pos, java.lang.String var3_delimiter1, java.lang.String var4_delimiter2) throws java.lang.Exception
	{

		com.altova.mapforce.IEnumerator e = create(var1_filepath,var2_pos,var3_delimiter1,var4_delimiter2).enumerator();
		if (e.moveNext())
		{
			java.math.BigDecimal result = ((java.math.BigDecimal)e.current());
			e.close();
			return result;
		}
		e.close();
		throw new com.altova.AltovaException("Expected a function result.");		
	
	}

}