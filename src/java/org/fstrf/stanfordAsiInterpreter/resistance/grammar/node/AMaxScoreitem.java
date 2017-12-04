/**
Copyright 2017 Frontier Science & Technology Research Foundation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

ADDITIONAL DISCLAIMER:
In addition to the standard warranty exclusions and limitations of 
liability set forth in sections 7, 8 and 9 of the Apache 2.0 license 
that governs the use and development of this software, Frontier Science 
& Technology Research Foundation disclaims any liability for use of 
this software for patient care or in clinical settings. This software 
was developed solely for use in medical and public health research, and 
was not intended, designed, or validated to guide patient care.
*/ 



/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.fstrf.stanfordAsiInterpreter.resistance.grammar.node;

import java.util.*;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.analysis.*;

public final class AMaxScoreitem extends PScoreitem
{
    private TMax _max_;
    private TLPar _lPar_;
    private PScorelist _scorelist_;
    private TRPar _rPar_;

    public AMaxScoreitem()
    {
    }

    public AMaxScoreitem(
        TMax _max_,
        TLPar _lPar_,
        PScorelist _scorelist_,
        TRPar _rPar_)
    {
        setMax(_max_);

        setLPar(_lPar_);

        setScorelist(_scorelist_);

        setRPar(_rPar_);

    }
    public Object clone()
    {
        return new AMaxScoreitem(
            (TMax) cloneNode(_max_),
            (TLPar) cloneNode(_lPar_),
            (PScorelist) cloneNode(_scorelist_),
            (TRPar) cloneNode(_rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaxScoreitem(this);
    }

    public TMax getMax()
    {
        return _max_;
    }

    public void setMax(TMax node)
    {
        if(_max_ != null)
        {
            _max_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _max_ = node;
    }

    public TLPar getLPar()
    {
        return _lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(_lPar_ != null)
        {
            _lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lPar_ = node;
    }

    public PScorelist getScorelist()
    {
        return _scorelist_;
    }

    public void setScorelist(PScorelist node)
    {
        if(_scorelist_ != null)
        {
            _scorelist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _scorelist_ = node;
    }

    public TRPar getRPar()
    {
        return _rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(_rPar_ != null)
        {
            _rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rPar_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_max_)
            + toString(_lPar_)
            + toString(_scorelist_)
            + toString(_rPar_);
    }

    void removeChild(Node child)
    {
        if(_max_ == child)
        {
            _max_ = null;
            return;
        }

        if(_lPar_ == child)
        {
            _lPar_ = null;
            return;
        }

        if(_scorelist_ == child)
        {
            _scorelist_ = null;
            return;
        }

        if(_rPar_ == child)
        {
            _rPar_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_max_ == oldChild)
        {
            setMax((TMax) newChild);
            return;
        }

        if(_lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(_scorelist_ == oldChild)
        {
            setScorelist((PScorelist) newChild);
            return;
        }

        if(_rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

    }
}