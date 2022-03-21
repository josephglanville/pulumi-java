// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An arm role receiver.
 * 
 */
public final class ArmRoleReceiverResponse extends io.pulumi.resources.InvokeArgs {

    public static final ArmRoleReceiverResponse Empty = new ArmRoleReceiverResponse();

    /**
     * The name of the arm role receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The arm role id.
     * 
     */
    @Import(name="roleId", required=true)
      private final String roleId;

    public String getRoleId() {
        return this.roleId;
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @Import(name="useCommonAlertSchema")
      private final @Nullable Boolean useCommonAlertSchema;

    public Optional<Boolean> getUseCommonAlertSchema() {
        return this.useCommonAlertSchema == null ? Optional.empty() : Optional.ofNullable(this.useCommonAlertSchema);
    }

    public ArmRoleReceiverResponse(
        String name,
        String roleId,
        @Nullable Boolean useCommonAlertSchema) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.roleId = Objects.requireNonNull(roleId, "expected parameter 'roleId' to be non-null");
        this.useCommonAlertSchema = useCommonAlertSchema == null ? false : useCommonAlertSchema;
    }

    private ArmRoleReceiverResponse() {
        this.name = null;
        this.roleId = null;
        this.useCommonAlertSchema = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArmRoleReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String roleId;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(ArmRoleReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.roleId = defaults.roleId;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder roleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }
        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }        public ArmRoleReceiverResponse build() {
            return new ArmRoleReceiverResponse(name, roleId, useCommonAlertSchema);
        }
    }
}
