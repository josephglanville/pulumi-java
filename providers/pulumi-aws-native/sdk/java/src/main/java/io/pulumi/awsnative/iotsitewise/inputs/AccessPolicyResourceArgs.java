// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyPortalArgs;
import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyProjectArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The AWS IoT SiteWise Monitor resource for this access policy. Choose either portal or project but not both.
 * 
 */
public final class AccessPolicyResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPolicyResourceArgs Empty = new AccessPolicyResourceArgs();

    @Import(name="portal")
      private final @Nullable Output<AccessPolicyPortalArgs> portal;

    public Output<AccessPolicyPortalArgs> getPortal() {
        return this.portal == null ? Output.empty() : this.portal;
    }

    @Import(name="project")
      private final @Nullable Output<AccessPolicyProjectArgs> project;

    public Output<AccessPolicyProjectArgs> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public AccessPolicyResourceArgs(
        @Nullable Output<AccessPolicyPortalArgs> portal,
        @Nullable Output<AccessPolicyProjectArgs> project) {
        this.portal = portal;
        this.project = project;
    }

    private AccessPolicyResourceArgs() {
        this.portal = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AccessPolicyPortalArgs> portal;
        private @Nullable Output<AccessPolicyProjectArgs> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portal = defaults.portal;
    	      this.project = defaults.project;
        }

        public Builder portal(@Nullable Output<AccessPolicyPortalArgs> portal) {
            this.portal = portal;
            return this;
        }
        public Builder portal(@Nullable AccessPolicyPortalArgs portal) {
            this.portal = Output.ofNullable(portal);
            return this;
        }
        public Builder project(@Nullable Output<AccessPolicyProjectArgs> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable AccessPolicyProjectArgs project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public AccessPolicyResourceArgs build() {
            return new AccessPolicyResourceArgs(portal, project);
        }
    }
}
