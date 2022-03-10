// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class StackSetInstanceDeploymentTargets {
    private final @Nullable List<String> organizationalUnitIds;

    @OutputCustomType.Constructor
    private StackSetInstanceDeploymentTargets(@OutputCustomType.Parameter("organizationalUnitIds") @Nullable List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
    }

    public List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds == null ? List.of() : this.organizationalUnitIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetInstanceDeploymentTargets defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> organizationalUnitIds;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetInstanceDeploymentTargets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationalUnitIds = defaults.organizationalUnitIds;
        }

        public Builder setOrganizationalUnitIds(@Nullable List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public StackSetInstanceDeploymentTargets build() {
            return new StackSetInstanceDeploymentTargets(organizationalUnitIds);
        }
    }
}
