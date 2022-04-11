// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.inputs.AuditConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.BindingArgs;
import io.pulumi.googlenative.compute_v1.inputs.RuleArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageIamPolicyArgs Empty = new ImageIamPolicyArgs();

    /**
     * Specifies cloud audit logging configuration for this policy.
     * 
     */
    @Import(name="auditConfigs")
      private final @Nullable Output<List<AuditConfigArgs>> auditConfigs;

    public Output<List<AuditConfigArgs>> getAuditConfigs() {
        return this.auditConfigs == null ? Codegen.empty() : this.auditConfigs;
    }

    /**
     * Associates a list of `members`, or principals, with a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one principal. The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to any other principal, then you can add another 1,450 principals to the `bindings` in the `Policy`.
     * 
     */
    @Import(name="bindings")
      private final @Nullable Output<List<BindingArgs>> bindings;

    public Output<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Codegen.empty() : this.bindings;
    }

    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="resource", required=true)
      private final Output<String> resource;

    public Output<String> getResource() {
        return this.resource;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<RuleArgs>> rules;

    public Output<List<RuleArgs>> getRules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    /**
     * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ImageIamPolicyArgs(
        @Nullable Output<List<AuditConfigArgs>> auditConfigs,
        @Nullable Output<List<BindingArgs>> bindings,
        @Nullable Output<String> etag,
        @Nullable Output<String> project,
        Output<String> resource,
        @Nullable Output<List<RuleArgs>> rules,
        @Nullable Output<Integer> version) {
        this.auditConfigs = auditConfigs;
        this.bindings = bindings;
        this.etag = etag;
        this.project = project;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.rules = rules;
        this.version = version;
    }

    private ImageIamPolicyArgs() {
        this.auditConfigs = Codegen.empty();
        this.bindings = Codegen.empty();
        this.etag = Codegen.empty();
        this.project = Codegen.empty();
        this.resource = Codegen.empty();
        this.rules = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AuditConfigArgs>> auditConfigs;
        private @Nullable Output<List<BindingArgs>> bindings;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> project;
        private Output<String> resource;
        private @Nullable Output<List<RuleArgs>> rules;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditConfigs = defaults.auditConfigs;
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.project = defaults.project;
    	      this.resource = defaults.resource;
    	      this.rules = defaults.rules;
    	      this.version = defaults.version;
        }

        public Builder auditConfigs(@Nullable Output<List<AuditConfigArgs>> auditConfigs) {
            this.auditConfigs = auditConfigs;
            return this;
        }
        public Builder auditConfigs(@Nullable List<AuditConfigArgs> auditConfigs) {
            this.auditConfigs = Codegen.ofNullable(auditConfigs);
            return this;
        }
        public Builder auditConfigs(AuditConfigArgs... auditConfigs) {
            return auditConfigs(List.of(auditConfigs));
        }
        public Builder bindings(@Nullable Output<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }
        public Builder bindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Codegen.ofNullable(bindings);
            return this;
        }
        public Builder bindings(BindingArgs... bindings) {
            return bindings(List.of(bindings));
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder resource(Output<String> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public Builder resource(String resource) {
            this.resource = Output.of(Objects.requireNonNull(resource));
            return this;
        }
        public Builder rules(@Nullable Output<List<RuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<RuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(RuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ImageIamPolicyArgs build() {
            return new ImageIamPolicyArgs(auditConfigs, bindings, etag, project, resource, rules, version);
        }
    }
}
