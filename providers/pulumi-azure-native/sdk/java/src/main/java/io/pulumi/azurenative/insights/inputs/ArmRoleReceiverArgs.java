// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An arm role receiver.
 * 
 */
public final class ArmRoleReceiverArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArmRoleReceiverArgs Empty = new ArmRoleReceiverArgs();

    /**
     * The name of the arm role receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The arm role id.
     * 
     */
    @InputImport(name="roleId", required=true)
      private final Input<String> roleId;

    public Input<String> getRoleId() {
        return this.roleId;
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @InputImport(name="useCommonAlertSchema")
      private final @Nullable Input<Boolean> useCommonAlertSchema;

    public Input<Boolean> getUseCommonAlertSchema() {
        return this.useCommonAlertSchema == null ? Input.empty() : this.useCommonAlertSchema;
    }

    public ArmRoleReceiverArgs(
        Input<String> name,
        Input<String> roleId,
        @Nullable Input<Boolean> useCommonAlertSchema) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.roleId = Objects.requireNonNull(roleId, "expected parameter 'roleId' to be non-null");
        this.useCommonAlertSchema = useCommonAlertSchema == null ? Input.ofNullable(false) : useCommonAlertSchema;
    }

    private ArmRoleReceiverArgs() {
        this.name = Input.empty();
        this.roleId = Input.empty();
        this.useCommonAlertSchema = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArmRoleReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> roleId;
        private @Nullable Input<Boolean> useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(ArmRoleReceiverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.roleId = defaults.roleId;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setRoleId(Input<String> roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = Input.of(Objects.requireNonNull(roleId));
            return this;
        }

        public Builder setUseCommonAlertSchema(@Nullable Input<Boolean> useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        public Builder setUseCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = Input.ofNullable(useCommonAlertSchema);
            return this;
        }
        public ArmRoleReceiverArgs build() {
            return new ArmRoleReceiverArgs(name, roleId, useCommonAlertSchema);
        }
    }
}
