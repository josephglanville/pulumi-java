// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.runtimeconfig.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVariableArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVariableArgs Empty = new GetVariableArgs();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="parent", required=true)
    private final String parent;

    public String getParent() {
        return this.parent;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetVariableArgs(
        String name,
        String parent,
        @Nullable String project) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.project = project;
    }

    private GetVariableArgs() {
        this.name = null;
        this.parent = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String parent;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.project = defaults.project;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetVariableArgs build() {
            return new GetVariableArgs(name, parent, project);
        }
    }
}