// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1.enums.ConditionIam;
import io.pulumi.googlenative.gameservices_v1.enums.ConditionOp;
import io.pulumi.googlenative.gameservices_v1.enums.ConditionSys;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A condition to be met.
 * 
 */
public final class ConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * Trusted attributes supplied by the IAM system.
     * 
     */
    @InputImport(name="iam")
      private final @Nullable Output<ConditionIam> iam;

    public Output<ConditionIam> getIam() {
        return this.iam == null ? Output.empty() : this.iam;
    }

    /**
     * An operator to apply the subject with.
     * 
     */
    @InputImport(name="op")
      private final @Nullable Output<ConditionOp> op;

    public Output<ConditionOp> getOp() {
        return this.op == null ? Output.empty() : this.op;
    }

    /**
     * Trusted attributes discharged by the service.
     * 
     */
    @InputImport(name="svc")
      private final @Nullable Output<String> svc;

    public Output<String> getSvc() {
        return this.svc == null ? Output.empty() : this.svc;
    }

    /**
     * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
     * 
     */
    @InputImport(name="sys")
      private final @Nullable Output<ConditionSys> sys;

    public Output<ConditionSys> getSys() {
        return this.sys == null ? Output.empty() : this.sys;
    }

    /**
     * The objects of the condition.
     * 
     */
    @InputImport(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public ConditionArgs(
        @Nullable Output<ConditionIam> iam,
        @Nullable Output<ConditionOp> op,
        @Nullable Output<String> svc,
        @Nullable Output<ConditionSys> sys,
        @Nullable Output<List<String>> values) {
        this.iam = iam;
        this.op = op;
        this.svc = svc;
        this.sys = sys;
        this.values = values;
    }

    private ConditionArgs() {
        this.iam = Output.empty();
        this.op = Output.empty();
        this.svc = Output.empty();
        this.sys = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConditionIam> iam;
        private @Nullable Output<ConditionOp> op;
        private @Nullable Output<String> svc;
        private @Nullable Output<ConditionSys> sys;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.op = defaults.op;
    	      this.svc = defaults.svc;
    	      this.sys = defaults.sys;
    	      this.values = defaults.values;
        }

        public Builder iam(@Nullable Output<ConditionIam> iam) {
            this.iam = iam;
            return this;
        }

        public Builder iam(@Nullable ConditionIam iam) {
            this.iam = Output.ofNullable(iam);
            return this;
        }

        public Builder op(@Nullable Output<ConditionOp> op) {
            this.op = op;
            return this;
        }

        public Builder op(@Nullable ConditionOp op) {
            this.op = Output.ofNullable(op);
            return this;
        }

        public Builder svc(@Nullable Output<String> svc) {
            this.svc = svc;
            return this;
        }

        public Builder svc(@Nullable String svc) {
            this.svc = Output.ofNullable(svc);
            return this;
        }

        public Builder sys(@Nullable Output<ConditionSys> sys) {
            this.sys = sys;
            return this;
        }

        public Builder sys(@Nullable ConditionSys sys) {
            this.sys = Output.ofNullable(sys);
            return this;
        }

        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public ConditionArgs build() {
            return new ConditionArgs(iam, op, svc, sys, values);
        }
    }
}
