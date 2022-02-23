// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelsAccessLevelBasicArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelsAccessLevelBasicArgs Empty = new AccessLevelsAccessLevelBasicArgs();

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
    @InputImport(name="combiningFunction")
      private final @Nullable Input<String> combiningFunction;

    public Input<String> getCombiningFunction() {
        return this.combiningFunction == null ? Input.empty() : this.combiningFunction;
    }

    /**
     * A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
     */
    @InputImport(name="conditions", required=true)
      private final Input<List<AccessLevelsAccessLevelBasicConditionArgs>> conditions;

    public Input<List<AccessLevelsAccessLevelBasicConditionArgs>> getConditions() {
        return this.conditions;
    }

    public AccessLevelsAccessLevelBasicArgs(
        @Nullable Input<String> combiningFunction,
        Input<List<AccessLevelsAccessLevelBasicConditionArgs>> conditions) {
        this.combiningFunction = combiningFunction;
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
    }

    private AccessLevelsAccessLevelBasicArgs() {
        this.combiningFunction = Input.empty();
        this.conditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelBasicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> combiningFunction;
        private Input<List<AccessLevelsAccessLevelBasicConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevelBasicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combiningFunction = defaults.combiningFunction;
    	      this.conditions = defaults.conditions;
        }

        public Builder setCombiningFunction(@Nullable Input<String> combiningFunction) {
            this.combiningFunction = combiningFunction;
            return this;
        }

        public Builder setCombiningFunction(@Nullable String combiningFunction) {
            this.combiningFunction = Input.ofNullable(combiningFunction);
            return this;
        }

        public Builder setConditions(Input<List<AccessLevelsAccessLevelBasicConditionArgs>> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setConditions(List<AccessLevelsAccessLevelBasicConditionArgs> conditions) {
            this.conditions = Input.of(Objects.requireNonNull(conditions));
            return this;
        }
        public AccessLevelsAccessLevelBasicArgs build() {
            return new AccessLevelsAccessLevelBasicArgs(combiningFunction, conditions);
        }
    }
}
