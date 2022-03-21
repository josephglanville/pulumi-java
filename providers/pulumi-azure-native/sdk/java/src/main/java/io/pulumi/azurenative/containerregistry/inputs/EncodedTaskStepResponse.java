// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.BaseImageDependencyResponse;
import io.pulumi.azurenative.containerregistry.inputs.SetValueResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a encoded task step.
 * 
 */
public final class EncodedTaskStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncodedTaskStepResponse Empty = new EncodedTaskStepResponse();

    /**
     * List of base image dependencies for a step.
     * 
     */
    @Import(name="baseImageDependencies", required=true)
      private final List<BaseImageDependencyResponse> baseImageDependencies;

    public List<BaseImageDependencyResponse> getBaseImageDependencies() {
        return this.baseImageDependencies;
    }

    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    @Import(name="contextAccessToken")
      private final @Nullable String contextAccessToken;

    public Optional<String> getContextAccessToken() {
        return this.contextAccessToken == null ? Optional.empty() : Optional.ofNullable(this.contextAccessToken);
    }

    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    @Import(name="contextPath")
      private final @Nullable String contextPath;

    public Optional<String> getContextPath() {
        return this.contextPath == null ? Optional.empty() : Optional.ofNullable(this.contextPath);
    }

    /**
     * Base64 encoded value of the template/definition file content.
     * 
     */
    @Import(name="encodedTaskContent", required=true)
      private final String encodedTaskContent;

    public String getEncodedTaskContent() {
        return this.encodedTaskContent;
    }

    /**
     * Base64 encoded value of the parameters/values file content.
     * 
     */
    @Import(name="encodedValuesContent")
      private final @Nullable String encodedValuesContent;

    public Optional<String> getEncodedValuesContent() {
        return this.encodedValuesContent == null ? Optional.empty() : Optional.ofNullable(this.encodedValuesContent);
    }

    /**
     * The type of the step.
     * Expected value is 'EncodedTask'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @Import(name="values")
      private final @Nullable List<SetValueResponse> values;

    public List<SetValueResponse> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public EncodedTaskStepResponse(
        List<BaseImageDependencyResponse> baseImageDependencies,
        @Nullable String contextAccessToken,
        @Nullable String contextPath,
        String encodedTaskContent,
        @Nullable String encodedValuesContent,
        String type,
        @Nullable List<SetValueResponse> values) {
        this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies, "expected parameter 'baseImageDependencies' to be non-null");
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent, "expected parameter 'encodedTaskContent' to be non-null");
        this.encodedValuesContent = encodedValuesContent;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
    }

    private EncodedTaskStepResponse() {
        this.baseImageDependencies = List.of();
        this.contextAccessToken = null;
        this.contextPath = null;
        this.encodedTaskContent = null;
        this.encodedValuesContent = null;
        this.type = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncodedTaskStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BaseImageDependencyResponse> baseImageDependencies;
        private @Nullable String contextAccessToken;
        private @Nullable String contextPath;
        private String encodedTaskContent;
        private @Nullable String encodedValuesContent;
        private String type;
        private @Nullable List<SetValueResponse> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EncodedTaskStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseImageDependencies = defaults.baseImageDependencies;
    	      this.contextAccessToken = defaults.contextAccessToken;
    	      this.contextPath = defaults.contextPath;
    	      this.encodedTaskContent = defaults.encodedTaskContent;
    	      this.encodedValuesContent = defaults.encodedValuesContent;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder baseImageDependencies(List<BaseImageDependencyResponse> baseImageDependencies) {
            this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies);
            return this;
        }
        public Builder baseImageDependencies(BaseImageDependencyResponse... baseImageDependencies) {
            return baseImageDependencies(List.of(baseImageDependencies));
        }
        public Builder contextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }
        public Builder contextPath(@Nullable String contextPath) {
            this.contextPath = contextPath;
            return this;
        }
        public Builder encodedTaskContent(String encodedTaskContent) {
            this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
            return this;
        }
        public Builder encodedValuesContent(@Nullable String encodedValuesContent) {
            this.encodedValuesContent = encodedValuesContent;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder values(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }
        public Builder values(SetValueResponse... values) {
            return values(List.of(values));
        }        public EncodedTaskStepResponse build() {
            return new EncodedTaskStepResponse(baseImageDependencies, contextAccessToken, contextPath, encodedTaskContent, encodedValuesContent, type, values);
        }
    }
}
