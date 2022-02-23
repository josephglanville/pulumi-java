// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of a task step.
 * 
 */
public final class FileTaskStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileTaskStepArgs Empty = new FileTaskStepArgs();

    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    @InputImport(name="contextAccessToken")
      private final @Nullable Input<String> contextAccessToken;

    public Input<String> getContextAccessToken() {
        return this.contextAccessToken == null ? Input.empty() : this.contextAccessToken;
    }

    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    @InputImport(name="contextPath")
      private final @Nullable Input<String> contextPath;

    public Input<String> getContextPath() {
        return this.contextPath == null ? Input.empty() : this.contextPath;
    }

    /**
     * The task template/definition file path relative to the source context.
     * 
     */
    @InputImport(name="taskFilePath", required=true)
      private final Input<String> taskFilePath;

    public Input<String> getTaskFilePath() {
        return this.taskFilePath;
    }

    /**
     * The type of the step.
     * Expected value is 'FileTask'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @InputImport(name="values")
      private final @Nullable Input<List<SetValueArgs>> values;

    public Input<List<SetValueArgs>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    /**
     * The task values/parameters file path relative to the source context.
     * 
     */
    @InputImport(name="valuesFilePath")
      private final @Nullable Input<String> valuesFilePath;

    public Input<String> getValuesFilePath() {
        return this.valuesFilePath == null ? Input.empty() : this.valuesFilePath;
    }

    public FileTaskStepArgs(
        @Nullable Input<String> contextAccessToken,
        @Nullable Input<String> contextPath,
        Input<String> taskFilePath,
        Input<String> type,
        @Nullable Input<List<SetValueArgs>> values,
        @Nullable Input<String> valuesFilePath) {
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.taskFilePath = Objects.requireNonNull(taskFilePath, "expected parameter 'taskFilePath' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
        this.valuesFilePath = valuesFilePath;
    }

    private FileTaskStepArgs() {
        this.contextAccessToken = Input.empty();
        this.contextPath = Input.empty();
        this.taskFilePath = Input.empty();
        this.type = Input.empty();
        this.values = Input.empty();
        this.valuesFilePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileTaskStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contextAccessToken;
        private @Nullable Input<String> contextPath;
        private Input<String> taskFilePath;
        private Input<String> type;
        private @Nullable Input<List<SetValueArgs>> values;
        private @Nullable Input<String> valuesFilePath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileTaskStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contextAccessToken = defaults.contextAccessToken;
    	      this.contextPath = defaults.contextPath;
    	      this.taskFilePath = defaults.taskFilePath;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
    	      this.valuesFilePath = defaults.valuesFilePath;
        }

        public Builder setContextAccessToken(@Nullable Input<String> contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }

        public Builder setContextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = Input.ofNullable(contextAccessToken);
            return this;
        }

        public Builder setContextPath(@Nullable Input<String> contextPath) {
            this.contextPath = contextPath;
            return this;
        }

        public Builder setContextPath(@Nullable String contextPath) {
            this.contextPath = Input.ofNullable(contextPath);
            return this;
        }

        public Builder setTaskFilePath(Input<String> taskFilePath) {
            this.taskFilePath = Objects.requireNonNull(taskFilePath);
            return this;
        }

        public Builder setTaskFilePath(String taskFilePath) {
            this.taskFilePath = Input.of(Objects.requireNonNull(taskFilePath));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValues(@Nullable Input<List<SetValueArgs>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<SetValueArgs> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public Builder setValuesFilePath(@Nullable Input<String> valuesFilePath) {
            this.valuesFilePath = valuesFilePath;
            return this;
        }

        public Builder setValuesFilePath(@Nullable String valuesFilePath) {
            this.valuesFilePath = Input.ofNullable(valuesFilePath);
            return this;
        }
        public FileTaskStepArgs build() {
            return new FileTaskStepArgs(contextAccessToken, contextPath, taskFilePath, type, values, valuesFilePath);
        }
    }
}
