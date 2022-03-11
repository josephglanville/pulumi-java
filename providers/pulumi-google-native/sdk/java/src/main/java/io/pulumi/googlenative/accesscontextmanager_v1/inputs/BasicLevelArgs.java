// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.enums.BasicLevelCombiningFunction;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.ConditionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `BasicLevel` is an `AccessLevel` using a set of recommended features.
 * 
 */
public final class BasicLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasicLevelArgs Empty = new BasicLevelArgs();

    /**
     * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
     * 
     */
    @InputImport(name="combiningFunction")
      private final @Nullable Output<BasicLevelCombiningFunction> combiningFunction;

    public Output<BasicLevelCombiningFunction> getCombiningFunction() {
        return this.combiningFunction == null ? Output.empty() : this.combiningFunction;
    }

    /**
     * A list of requirements for the `AccessLevel` to be granted.
     * 
     */
    @InputImport(name="conditions", required=true)
      private final Output<List<ConditionArgs>> conditions;

    public Output<List<ConditionArgs>> getConditions() {
        return this.conditions;
    }

    public BasicLevelArgs(
        @Nullable Output<BasicLevelCombiningFunction> combiningFunction,
        Output<List<ConditionArgs>> conditions) {
        this.combiningFunction = combiningFunction;
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
    }

    private BasicLevelArgs() {
        this.combiningFunction = Output.empty();
        this.conditions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BasicLevelCombiningFunction> combiningFunction;
        private Output<List<ConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combiningFunction = defaults.combiningFunction;
    	      this.conditions = defaults.conditions;
        }

        public Builder combiningFunction(@Nullable Output<BasicLevelCombiningFunction> combiningFunction) {
            this.combiningFunction = combiningFunction;
            return this;
        }

        public Builder combiningFunction(@Nullable BasicLevelCombiningFunction combiningFunction) {
            this.combiningFunction = Output.ofNullable(combiningFunction);
            return this;
        }

        public Builder conditions(Output<List<ConditionArgs>> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder conditions(List<ConditionArgs> conditions) {
            this.conditions = Output.of(Objects.requireNonNull(conditions));
            return this;
        }
        public BasicLevelArgs build() {
            return new BasicLevelArgs(combiningFunction, conditions);
        }
    }
}
