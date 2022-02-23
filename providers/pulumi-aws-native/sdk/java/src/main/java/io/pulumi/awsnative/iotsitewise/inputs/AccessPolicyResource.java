// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyPortal;
import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyProject;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The AWS IoT SiteWise Monitor resource for this access policy. Choose either portal or project but not both.
 * 
 */
public final class AccessPolicyResource extends io.pulumi.resources.InvokeArgs {

    public static final AccessPolicyResource Empty = new AccessPolicyResource();

    @InputImport(name="portal")
      private final @Nullable AccessPolicyPortal portal;

    public Optional<AccessPolicyPortal> getPortal() {
        return this.portal == null ? Optional.empty() : Optional.ofNullable(this.portal);
    }

    @InputImport(name="project")
      private final @Nullable AccessPolicyProject project;

    public Optional<AccessPolicyProject> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public AccessPolicyResource(
        @Nullable AccessPolicyPortal portal,
        @Nullable AccessPolicyProject project) {
        this.portal = portal;
        this.project = project;
    }

    private AccessPolicyResource() {
        this.portal = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccessPolicyPortal portal;
        private @Nullable AccessPolicyProject project;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portal = defaults.portal;
    	      this.project = defaults.project;
        }

        public Builder setPortal(@Nullable AccessPolicyPortal portal) {
            this.portal = portal;
            return this;
        }

        public Builder setProject(@Nullable AccessPolicyProject project) {
            this.project = project;
            return this;
        }
        public AccessPolicyResource build() {
            return new AccessPolicyResource(portal, project);
        }
    }
}
