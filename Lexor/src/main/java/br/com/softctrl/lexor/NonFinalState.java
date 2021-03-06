/**
 * 
 */
package br.com.softctrl.lexor;

/*
The GNU Lesser General Public License v3 (or later)

Copyright (c) 2017 Carlos Timoshenko Rodrigues Lopes
http://www.0x09.com.br

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

/**
 * @author carlostimoshenkorodrigueslopes@gmail.com
 */
public abstract class NonFinalState implements State {

	private final Machine machine;

	/**
	 * 
	 * @param machine
	 */
	public NonFinalState(Machine machine) {
		this.machine = machine;
	}

	/**
	 * 
	 * @return
	 */
	protected Machine getMachine() {
		return machine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.State#isInitial()
	 */
	public boolean isInitial() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.State#isFinal()
	 */
	public final boolean isFinal() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.State#getType()
	 */
	public Type getType() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.State#moveToNext()
	 */
	public boolean moveToNext() {
		return false;
	}

}
