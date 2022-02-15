// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatastoreIODetailsResponse {
    private final String namespace;
    private final String project;

    @OutputCustomType.Constructor({"namespace","project"})
    private DatastoreIODetailsResponse(
        String namespace,
        String project) {
        this.namespace = Objects.requireNonNull(namespace);
        this.project = Objects.requireNonNull(project);
    }

    public String getNamespace() {
        return this.namespace;
    }
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreIODetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreIODetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
    	      this.project = defaults.project;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public DatastoreIODetailsResponse build() {
            return new DatastoreIODetailsResponse(namespace, project);
        }
    }
}