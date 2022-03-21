// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelBasicGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelBasicGetArgs Empty = new AccessLevelBasicGetArgs();

    /**
     * How the conditions list should be combined to determine if a request
     * is granted this AccessLevel. If AND is used, each Condition in
     * conditions must be satisfied for the AccessLevel to be applied. If
     * OR is used, at least one Condition in conditions must be satisfied
     * for the AccessLevel to be applied.
     * Default value is `AND`.
     * Possible values are `AND` and `OR`.
     * 
     */
    @Import(name="combiningFunction")
      private final @Nullable Output<String> combiningFunction;

    public Output<String> getCombiningFunction() {
        return this.combiningFunction == null ? Output.empty() : this.combiningFunction;
    }

    /**
     * A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
     */
    @Import(name="conditions", required=true)
      private final Output<List<AccessLevelBasicConditionGetArgs>> conditions;

    public Output<List<AccessLevelBasicConditionGetArgs>> getConditions() {
        return this.conditions;
    }

    public AccessLevelBasicGetArgs(
        @Nullable Output<String> combiningFunction,
        Output<List<AccessLevelBasicConditionGetArgs>> conditions) {
        this.combiningFunction = combiningFunction;
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
    }

    private AccessLevelBasicGetArgs() {
        this.combiningFunction = Output.empty();
        this.conditions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelBasicGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> combiningFunction;
        private Output<List<AccessLevelBasicConditionGetArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelBasicGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combiningFunction = defaults.combiningFunction;
    	      this.conditions = defaults.conditions;
        }

        public Builder combiningFunction(@Nullable Output<String> combiningFunction) {
            this.combiningFunction = combiningFunction;
            return this;
        }
        public Builder combiningFunction(@Nullable String combiningFunction) {
            this.combiningFunction = Output.ofNullable(combiningFunction);
            return this;
        }
        public Builder conditions(Output<List<AccessLevelBasicConditionGetArgs>> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(List<AccessLevelBasicConditionGetArgs> conditions) {
            this.conditions = Output.of(Objects.requireNonNull(conditions));
            return this;
        }
        public Builder conditions(AccessLevelBasicConditionGetArgs... conditions) {
            return conditions(List.of(conditions));
        }        public AccessLevelBasicGetArgs build() {
            return new AccessLevelBasicGetArgs(combiningFunction, conditions);
        }
    }
}
