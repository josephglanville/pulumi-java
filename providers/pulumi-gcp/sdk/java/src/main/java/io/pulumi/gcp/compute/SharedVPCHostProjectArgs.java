// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SharedVPCHostProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharedVPCHostProjectArgs Empty = new SharedVPCHostProjectArgs();

    /**
     * The ID of the project that will serve as a Shared VPC host project
     * 
     */
    @InputImport(name="project", required=true)
      private final Input<String> project;

    public Input<String> getProject() {
        return this.project;
    }

    public SharedVPCHostProjectArgs(Input<String> project) {
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private SharedVPCHostProjectArgs() {
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedVPCHostProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedVPCHostProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
        }

        public Builder setProject(Input<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Input.of(Objects.requireNonNull(project));
            return this;
        }
        public SharedVPCHostProjectArgs build() {
            return new SharedVPCHostProjectArgs(project);
        }
    }
}
