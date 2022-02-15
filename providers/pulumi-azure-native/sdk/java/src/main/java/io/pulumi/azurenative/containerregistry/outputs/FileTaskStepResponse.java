// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.BaseImageDependencyResponse;
import io.pulumi.azurenative.containerregistry.outputs.SetValueResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FileTaskStepResponse {
    private final List<BaseImageDependencyResponse> baseImageDependencies;
    private final @Nullable String contextAccessToken;
    private final @Nullable String contextPath;
    private final String taskFilePath;
    private final String type;
    private final @Nullable List<SetValueResponse> values;
    private final @Nullable String valuesFilePath;

    @OutputCustomType.Constructor({"baseImageDependencies","contextAccessToken","contextPath","taskFilePath","type","values","valuesFilePath"})
    private FileTaskStepResponse(
        List<BaseImageDependencyResponse> baseImageDependencies,
        @Nullable String contextAccessToken,
        @Nullable String contextPath,
        String taskFilePath,
        String type,
        @Nullable List<SetValueResponse> values,
        @Nullable String valuesFilePath) {
        this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies);
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.taskFilePath = Objects.requireNonNull(taskFilePath);
        this.type = Objects.requireNonNull(type);
        this.values = values;
        this.valuesFilePath = valuesFilePath;
    }

    public List<BaseImageDependencyResponse> getBaseImageDependencies() {
        return this.baseImageDependencies;
    }
    public Optional<String> getContextAccessToken() {
        return Optional.ofNullable(this.contextAccessToken);
    }
    public Optional<String> getContextPath() {
        return Optional.ofNullable(this.contextPath);
    }
    public String getTaskFilePath() {
        return this.taskFilePath;
    }
    public String getType() {
        return this.type;
    }
    public List<SetValueResponse> getValues() {
        return this.values == null ? List.of() : this.values;
    }
    public Optional<String> getValuesFilePath() {
        return Optional.ofNullable(this.valuesFilePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileTaskStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BaseImageDependencyResponse> baseImageDependencies;
        private @Nullable String contextAccessToken;
        private @Nullable String contextPath;
        private String taskFilePath;
        private String type;
        private @Nullable List<SetValueResponse> values;
        private @Nullable String valuesFilePath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileTaskStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseImageDependencies = defaults.baseImageDependencies;
    	      this.contextAccessToken = defaults.contextAccessToken;
    	      this.contextPath = defaults.contextPath;
    	      this.taskFilePath = defaults.taskFilePath;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
    	      this.valuesFilePath = defaults.valuesFilePath;
        }

        public Builder setBaseImageDependencies(List<BaseImageDependencyResponse> baseImageDependencies) {
            this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies);
            return this;
        }

        public Builder setContextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }

        public Builder setContextPath(@Nullable String contextPath) {
            this.contextPath = contextPath;
            return this;
        }

        public Builder setTaskFilePath(String taskFilePath) {
            this.taskFilePath = Objects.requireNonNull(taskFilePath);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValues(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }

        public Builder setValuesFilePath(@Nullable String valuesFilePath) {
            this.valuesFilePath = valuesFilePath;
            return this;
        }

        public FileTaskStepResponse build() {
            return new FileTaskStepResponse(baseImageDependencies, contextAccessToken, contextPath, taskFilePath, type, values, valuesFilePath);
        }
    }
}