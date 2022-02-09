// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.azurenative.authorization.inputs.PrincipalResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyAssignmentPropertiesResponsePolicy extends io.pulumi.resources.InvokeArgs {

    public static final PolicyAssignmentPropertiesResponsePolicy Empty = new PolicyAssignmentPropertiesResponsePolicy();

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="lastModifiedBy", required=true)
    private final PrincipalResponse lastModifiedBy;

    public PrincipalResponse getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @InputImport(name="lastModifiedDateTime")
    private final @Nullable String lastModifiedDateTime;

    public Optional<String> getLastModifiedDateTime() {
        return this.lastModifiedDateTime == null ? Optional.empty() : Optional.ofNullable(this.lastModifiedDateTime);
    }

    public PolicyAssignmentPropertiesResponsePolicy(
        @Nullable String id,
        PrincipalResponse lastModifiedBy,
        @Nullable String lastModifiedDateTime) {
        this.id = id;
        this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy, "expected parameter 'lastModifiedBy' to be non-null");
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    private PolicyAssignmentPropertiesResponsePolicy() {
        this.id = null;
        this.lastModifiedBy = null;
        this.lastModifiedDateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentPropertiesResponsePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private PrincipalResponse lastModifiedBy;
        private @Nullable String lastModifiedDateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentPropertiesResponsePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedDateTime = defaults.lastModifiedDateTime;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLastModifiedBy(PrincipalResponse lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }

        public Builder setLastModifiedDateTime(@Nullable String lastModifiedDateTime) {
            this.lastModifiedDateTime = lastModifiedDateTime;
            return this;
        }

        public PolicyAssignmentPropertiesResponsePolicy build() {
            return new PolicyAssignmentPropertiesResponsePolicy(id, lastModifiedBy, lastModifiedDateTime);
        }
    }
}
