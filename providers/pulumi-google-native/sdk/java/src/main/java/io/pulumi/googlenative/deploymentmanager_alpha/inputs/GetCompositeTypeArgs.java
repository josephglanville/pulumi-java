// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCompositeTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCompositeTypeArgs Empty = new GetCompositeTypeArgs();

    @Import(name="compositeType", required=true)
      private final String compositeType;

    public String getCompositeType() {
        return this.compositeType;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetCompositeTypeArgs(
        String compositeType,
        @Nullable String project) {
        this.compositeType = Objects.requireNonNull(compositeType, "expected parameter 'compositeType' to be non-null");
        this.project = project;
    }

    private GetCompositeTypeArgs() {
        this.compositeType = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCompositeTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compositeType;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCompositeTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeType = defaults.compositeType;
    	      this.project = defaults.project;
        }

        public Builder compositeType(String compositeType) {
            this.compositeType = Objects.requireNonNull(compositeType);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetCompositeTypeArgs build() {
            return new GetCompositeTypeArgs(compositeType, project);
        }
    }
}
