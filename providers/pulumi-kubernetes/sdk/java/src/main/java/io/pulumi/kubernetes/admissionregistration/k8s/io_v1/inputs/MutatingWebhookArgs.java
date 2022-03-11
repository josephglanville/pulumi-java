// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1.inputs.RuleWithOperationsArgs;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1.inputs.WebhookClientConfigArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
 * 
 */
public final class MutatingWebhookArgs extends io.pulumi.resources.ResourceArgs {

    public static final MutatingWebhookArgs Empty = new MutatingWebhookArgs();

    /**
     * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
     * 
     */
    @InputImport(name="admissionReviewVersions", required=true)
      private final Output<List<String>> admissionReviewVersions;

    public Output<List<String>> getAdmissionReviewVersions() {
        return this.admissionReviewVersions;
    }

    /**
     * ClientConfig defines how to communicate with the hook. Required
     * 
     */
    @InputImport(name="clientConfig", required=true)
      private final Output<WebhookClientConfigArgs> clientConfig;

    public Output<WebhookClientConfigArgs> getClientConfig() {
        return this.clientConfig;
    }

    /**
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.
     * 
     */
    @InputImport(name="failurePolicy")
      private final @Nullable Output<String> failurePolicy;

    public Output<String> getFailurePolicy() {
        return this.failurePolicy == null ? Output.empty() : this.failurePolicy;
    }

    /**
     * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
     * 
     * Defaults to "Equivalent"
     * 
     */
    @InputImport(name="matchPolicy")
      private final @Nullable Output<String> matchPolicy;

    public Output<String> getMatchPolicy() {
        return this.matchPolicy == null ? Output.empty() : this.matchPolicy;
    }

    /**
     * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
     * 
     * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * 
     * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * 
     * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
     * 
     * Default to the empty LabelSelector, which matches everything.
     * 
     */
    @InputImport(name="namespaceSelector")
      private final @Nullable Output<LabelSelectorArgs> namespaceSelector;

    public Output<LabelSelectorArgs> getNamespaceSelector() {
        return this.namespaceSelector == null ? Output.empty() : this.namespaceSelector;
    }

    /**
     * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    @InputImport(name="objectSelector")
      private final @Nullable Output<LabelSelectorArgs> objectSelector;

    public Output<LabelSelectorArgs> getObjectSelector() {
        return this.objectSelector == null ? Output.empty() : this.objectSelector;
    }

    /**
     * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
     * 
     * Never: the webhook will not be called more than once in a single admission evaluation.
     * 
     * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
     * 
     * Defaults to "Never".
     * 
     */
    @InputImport(name="reinvocationPolicy")
      private final @Nullable Output<String> reinvocationPolicy;

    public Output<String> getReinvocationPolicy() {
        return this.reinvocationPolicy == null ? Output.empty() : this.reinvocationPolicy;
    }

    /**
     * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Output<List<RuleWithOperationsArgs>> rules;

    public Output<List<RuleWithOperationsArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission chain and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.
     * 
     */
    @InputImport(name="sideEffects", required=true)
      private final Output<String> sideEffects;

    public Output<String> getSideEffects() {
        return this.sideEffects;
    }

    /**
     * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
     * 
     */
    @InputImport(name="timeoutSeconds")
      private final @Nullable Output<Integer> timeoutSeconds;

    public Output<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Output.empty() : this.timeoutSeconds;
    }

    public MutatingWebhookArgs(
        Output<List<String>> admissionReviewVersions,
        Output<WebhookClientConfigArgs> clientConfig,
        @Nullable Output<String> failurePolicy,
        @Nullable Output<String> matchPolicy,
        Output<String> name,
        @Nullable Output<LabelSelectorArgs> namespaceSelector,
        @Nullable Output<LabelSelectorArgs> objectSelector,
        @Nullable Output<String> reinvocationPolicy,
        @Nullable Output<List<RuleWithOperationsArgs>> rules,
        Output<String> sideEffects,
        @Nullable Output<Integer> timeoutSeconds) {
        this.admissionReviewVersions = Objects.requireNonNull(admissionReviewVersions, "expected parameter 'admissionReviewVersions' to be non-null");
        this.clientConfig = Objects.requireNonNull(clientConfig, "expected parameter 'clientConfig' to be non-null");
        this.failurePolicy = failurePolicy;
        this.matchPolicy = matchPolicy;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespaceSelector = namespaceSelector;
        this.objectSelector = objectSelector;
        this.reinvocationPolicy = reinvocationPolicy;
        this.rules = rules;
        this.sideEffects = Objects.requireNonNull(sideEffects, "expected parameter 'sideEffects' to be non-null");
        this.timeoutSeconds = timeoutSeconds;
    }

    private MutatingWebhookArgs() {
        this.admissionReviewVersions = Output.empty();
        this.clientConfig = Output.empty();
        this.failurePolicy = Output.empty();
        this.matchPolicy = Output.empty();
        this.name = Output.empty();
        this.namespaceSelector = Output.empty();
        this.objectSelector = Output.empty();
        this.reinvocationPolicy = Output.empty();
        this.rules = Output.empty();
        this.sideEffects = Output.empty();
        this.timeoutSeconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MutatingWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> admissionReviewVersions;
        private Output<WebhookClientConfigArgs> clientConfig;
        private @Nullable Output<String> failurePolicy;
        private @Nullable Output<String> matchPolicy;
        private Output<String> name;
        private @Nullable Output<LabelSelectorArgs> namespaceSelector;
        private @Nullable Output<LabelSelectorArgs> objectSelector;
        private @Nullable Output<String> reinvocationPolicy;
        private @Nullable Output<List<RuleWithOperationsArgs>> rules;
        private Output<String> sideEffects;
        private @Nullable Output<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(MutatingWebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admissionReviewVersions = defaults.admissionReviewVersions;
    	      this.clientConfig = defaults.clientConfig;
    	      this.failurePolicy = defaults.failurePolicy;
    	      this.matchPolicy = defaults.matchPolicy;
    	      this.name = defaults.name;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.objectSelector = defaults.objectSelector;
    	      this.reinvocationPolicy = defaults.reinvocationPolicy;
    	      this.rules = defaults.rules;
    	      this.sideEffects = defaults.sideEffects;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder admissionReviewVersions(Output<List<String>> admissionReviewVersions) {
            this.admissionReviewVersions = Objects.requireNonNull(admissionReviewVersions);
            return this;
        }

        public Builder admissionReviewVersions(List<String> admissionReviewVersions) {
            this.admissionReviewVersions = Output.of(Objects.requireNonNull(admissionReviewVersions));
            return this;
        }

        public Builder clientConfig(Output<WebhookClientConfigArgs> clientConfig) {
            this.clientConfig = Objects.requireNonNull(clientConfig);
            return this;
        }

        public Builder clientConfig(WebhookClientConfigArgs clientConfig) {
            this.clientConfig = Output.of(Objects.requireNonNull(clientConfig));
            return this;
        }

        public Builder failurePolicy(@Nullable Output<String> failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }

        public Builder failurePolicy(@Nullable String failurePolicy) {
            this.failurePolicy = Output.ofNullable(failurePolicy);
            return this;
        }

        public Builder matchPolicy(@Nullable Output<String> matchPolicy) {
            this.matchPolicy = matchPolicy;
            return this;
        }

        public Builder matchPolicy(@Nullable String matchPolicy) {
            this.matchPolicy = Output.ofNullable(matchPolicy);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder namespaceSelector(@Nullable Output<LabelSelectorArgs> namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        public Builder namespaceSelector(@Nullable LabelSelectorArgs namespaceSelector) {
            this.namespaceSelector = Output.ofNullable(namespaceSelector);
            return this;
        }

        public Builder objectSelector(@Nullable Output<LabelSelectorArgs> objectSelector) {
            this.objectSelector = objectSelector;
            return this;
        }

        public Builder objectSelector(@Nullable LabelSelectorArgs objectSelector) {
            this.objectSelector = Output.ofNullable(objectSelector);
            return this;
        }

        public Builder reinvocationPolicy(@Nullable Output<String> reinvocationPolicy) {
            this.reinvocationPolicy = reinvocationPolicy;
            return this;
        }

        public Builder reinvocationPolicy(@Nullable String reinvocationPolicy) {
            this.reinvocationPolicy = Output.ofNullable(reinvocationPolicy);
            return this;
        }

        public Builder rules(@Nullable Output<List<RuleWithOperationsArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(@Nullable List<RuleWithOperationsArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }

        public Builder sideEffects(Output<String> sideEffects) {
            this.sideEffects = Objects.requireNonNull(sideEffects);
            return this;
        }

        public Builder sideEffects(String sideEffects) {
            this.sideEffects = Output.of(Objects.requireNonNull(sideEffects));
            return this;
        }

        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Output.ofNullable(timeoutSeconds);
            return this;
        }
        public MutatingWebhookArgs build() {
            return new MutatingWebhookArgs(admissionReviewVersions, clientConfig, failurePolicy, matchPolicy, name, namespaceSelector, objectSelector, reinvocationPolicy, rules, sideEffects, timeoutSeconds);
        }
    }
}
