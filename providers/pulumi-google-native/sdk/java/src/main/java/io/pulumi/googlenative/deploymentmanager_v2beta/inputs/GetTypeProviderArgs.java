// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTypeProviderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTypeProviderArgs Empty = new GetTypeProviderArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="typeProvider", required=true)
      private final String typeProvider;

    public String getTypeProvider() {
        return this.typeProvider;
    }

    public GetTypeProviderArgs(
        @Nullable String project,
        String typeProvider) {
        this.project = project;
        this.typeProvider = Objects.requireNonNull(typeProvider, "expected parameter 'typeProvider' to be non-null");
    }

    private GetTypeProviderArgs() {
        this.project = null;
        this.typeProvider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTypeProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String typeProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTypeProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.typeProvider = defaults.typeProvider;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder typeProvider(String typeProvider) {
            this.typeProvider = Objects.requireNonNull(typeProvider);
            return this;
        }        public GetTypeProviderArgs build() {
            return new GetTypeProviderArgs(project, typeProvider);
        }
    }
}
