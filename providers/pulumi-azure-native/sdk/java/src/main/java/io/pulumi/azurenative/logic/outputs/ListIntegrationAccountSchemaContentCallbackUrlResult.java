// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.WorkflowTriggerListCallbackUrlQueriesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListIntegrationAccountSchemaContentCallbackUrlResult {
    private final String basePath;
    private final String method;
    private final @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries;
    private final String relativePath;
    private final @Nullable List<String> relativePathParameters;
    private final String value;

    @OutputCustomType.Constructor({"basePath","method","queries","relativePath","relativePathParameters","value"})
    private ListIntegrationAccountSchemaContentCallbackUrlResult(
        String basePath,
        String method,
        @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries,
        String relativePath,
        @Nullable List<String> relativePathParameters,
        String value) {
        this.basePath = Objects.requireNonNull(basePath);
        this.method = Objects.requireNonNull(method);
        this.queries = queries;
        this.relativePath = Objects.requireNonNull(relativePath);
        this.relativePathParameters = relativePathParameters;
        this.value = Objects.requireNonNull(value);
    }

    public String getBasePath() {
        return this.basePath;
    }
    public String getMethod() {
        return this.method;
    }
    public Optional<WorkflowTriggerListCallbackUrlQueriesResponse> getQueries() {
        return Optional.ofNullable(this.queries);
    }
    public String getRelativePath() {
        return this.relativePath;
    }
    public List<String> getRelativePathParameters() {
        return this.relativePathParameters == null ? List.of() : this.relativePathParameters;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationAccountSchemaContentCallbackUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String basePath;
        private String method;
        private @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries;
        private String relativePath;
        private @Nullable List<String> relativePathParameters;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationAccountSchemaContentCallbackUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePath = defaults.basePath;
    	      this.method = defaults.method;
    	      this.queries = defaults.queries;
    	      this.relativePath = defaults.relativePath;
    	      this.relativePathParameters = defaults.relativePathParameters;
    	      this.value = defaults.value;
        }

        public Builder setBasePath(String basePath) {
            this.basePath = Objects.requireNonNull(basePath);
            return this;
        }

        public Builder setMethod(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setQueries(@Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries) {
            this.queries = queries;
            return this;
        }

        public Builder setRelativePath(String relativePath) {
            this.relativePath = Objects.requireNonNull(relativePath);
            return this;
        }

        public Builder setRelativePathParameters(@Nullable List<String> relativePathParameters) {
            this.relativePathParameters = relativePathParameters;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ListIntegrationAccountSchemaContentCallbackUrlResult build() {
            return new ListIntegrationAccountSchemaContentCallbackUrlResult(basePath, method, queries, relativePath, relativePathParameters, value);
        }
    }
}
