// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class ConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConditionResponse Empty = new ConditionResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="iam", required=true)
      private final String iam;

    public String getIam() {
        return this.iam;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="op", required=true)
      private final String op;

    public String getOp() {
        return this.op;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="svc", required=true)
      private final String svc;

    public String getSvc() {
        return this.svc;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="sys", required=true)
      private final String sys;

    public String getSys() {
        return this.sys;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public ConditionResponse(
        String iam,
        String op,
        String svc,
        String sys,
        List<String> values) {
        this.iam = Objects.requireNonNull(iam, "expected parameter 'iam' to be non-null");
        this.op = Objects.requireNonNull(op, "expected parameter 'op' to be non-null");
        this.svc = Objects.requireNonNull(svc, "expected parameter 'svc' to be non-null");
        this.sys = Objects.requireNonNull(sys, "expected parameter 'sys' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ConditionResponse() {
        this.iam = null;
        this.op = null;
        this.svc = null;
        this.sys = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iam;
        private String op;
        private String svc;
        private String sys;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.op = defaults.op;
    	      this.svc = defaults.svc;
    	      this.sys = defaults.sys;
    	      this.values = defaults.values;
        }

        public Builder iam(String iam) {
            this.iam = Objects.requireNonNull(iam);
            return this;
        }
        public Builder op(String op) {
            this.op = Objects.requireNonNull(op);
            return this;
        }
        public Builder svc(String svc) {
            this.svc = Objects.requireNonNull(svc);
            return this;
        }
        public Builder sys(String sys) {
            this.sys = Objects.requireNonNull(sys);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ConditionResponse build() {
            return new ConditionResponse(iam, op, svc, sys, values);
        }
    }
}
