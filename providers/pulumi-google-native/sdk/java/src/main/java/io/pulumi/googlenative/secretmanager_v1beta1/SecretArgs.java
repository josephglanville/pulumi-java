// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.secretmanager_v1beta1.inputs.ReplicationArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
     */
    @InputImport(name="replication", required=true)
      private final Output<ReplicationArgs> replication;

    public Output<ReplicationArgs> getReplication() {
        return this.replication;
    }

    @InputImport(name="secretId", required=true)
      private final Output<String> secretId;

    public Output<String> getSecretId() {
        return this.secretId;
    }

    public SecretArgs(
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> project,
        Output<ReplicationArgs> replication,
        Output<String> secretId) {
        this.labels = labels;
        this.project = project;
        this.replication = Objects.requireNonNull(replication, "expected parameter 'replication' to be non-null");
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
    }

    private SecretArgs() {
        this.labels = Output.empty();
        this.project = Output.empty();
        this.replication = Output.empty();
        this.secretId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> project;
        private Output<ReplicationArgs> replication;
        private Output<String> secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.replication = defaults.replication;
    	      this.secretId = defaults.secretId;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder replication(Output<ReplicationArgs> replication) {
            this.replication = Objects.requireNonNull(replication);
            return this;
        }

        public Builder replication(ReplicationArgs replication) {
            this.replication = Output.of(Objects.requireNonNull(replication));
            return this;
        }

        public Builder secretId(Output<String> secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }

        public Builder secretId(String secretId) {
            this.secretId = Output.of(Objects.requireNonNull(secretId));
            return this;
        }
        public SecretArgs build() {
            return new SecretArgs(labels, project, replication, secretId);
        }
    }
}
