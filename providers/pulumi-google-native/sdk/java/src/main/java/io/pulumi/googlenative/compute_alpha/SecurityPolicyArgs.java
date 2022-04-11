// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.SecurityPolicyType;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAdaptiveProtectionConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAdvancedOptionsConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAssociationArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyCloudArmorConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyDdosProtectionConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRecaptchaOptionsConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyArgs Empty = new SecurityPolicyArgs();

    @Import(name="adaptiveProtectionConfig")
      private final @Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;

    public Output<SecurityPolicyAdaptiveProtectionConfigArgs> getAdaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig == null ? Codegen.empty() : this.adaptiveProtectionConfig;
    }

    @Import(name="advancedOptionsConfig")
      private final @Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig;

    public Output<SecurityPolicyAdvancedOptionsConfigArgs> getAdvancedOptionsConfig() {
        return this.advancedOptionsConfig == null ? Codegen.empty() : this.advancedOptionsConfig;
    }

    /**
     * A list of associations that belong to this policy.
     * 
     */
    @Import(name="associations")
      private final @Nullable Output<List<SecurityPolicyAssociationArgs>> associations;

    public Output<List<SecurityPolicyAssociationArgs>> getAssociations() {
        return this.associations == null ? Codegen.empty() : this.associations;
    }

    @Import(name="cloudArmorConfig")
      private final @Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig;

    public Output<SecurityPolicyCloudArmorConfigArgs> getCloudArmorConfig() {
        return this.cloudArmorConfig == null ? Codegen.empty() : this.cloudArmorConfig;
    }

    @Import(name="ddosProtectionConfig")
      private final @Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig;

    public Output<SecurityPolicyDdosProtectionConfigArgs> getDdosProtectionConfig() {
        return this.ddosProtectionConfig == null ? Codegen.empty() : this.ddosProtectionConfig;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="recaptchaOptionsConfig")
      private final @Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;

    public Output<SecurityPolicyRecaptchaOptionsConfigArgs> getRecaptchaOptionsConfig() {
        return this.recaptchaOptionsConfig == null ? Codegen.empty() : this.recaptchaOptionsConfig;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a default rule with action "allow" will be added.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<SecurityPolicyRuleArgs>> rules;

    public Output<List<SecurityPolicyRuleArgs>> getRules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    /**
     * The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<SecurityPolicyType> type;

    public Output<SecurityPolicyType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    @Import(name="validateOnly")
      private final @Nullable Output<String> validateOnly;

    public Output<String> getValidateOnly() {
        return this.validateOnly == null ? Codegen.empty() : this.validateOnly;
    }

    public SecurityPolicyArgs(
        @Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig,
        @Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig,
        @Nullable Output<List<SecurityPolicyAssociationArgs>> associations,
        @Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig,
        @Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig,
        @Nullable Output<String> requestId,
        @Nullable Output<List<SecurityPolicyRuleArgs>> rules,
        @Nullable Output<SecurityPolicyType> type,
        @Nullable Output<String> validateOnly) {
        this.adaptiveProtectionConfig = adaptiveProtectionConfig;
        this.advancedOptionsConfig = advancedOptionsConfig;
        this.associations = associations;
        this.cloudArmorConfig = cloudArmorConfig;
        this.ddosProtectionConfig = ddosProtectionConfig;
        this.description = description;
        this.displayName = displayName;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.recaptchaOptionsConfig = recaptchaOptionsConfig;
        this.requestId = requestId;
        this.rules = rules;
        this.type = type;
        this.validateOnly = validateOnly;
    }

    private SecurityPolicyArgs() {
        this.adaptiveProtectionConfig = Codegen.empty();
        this.advancedOptionsConfig = Codegen.empty();
        this.associations = Codegen.empty();
        this.cloudArmorConfig = Codegen.empty();
        this.ddosProtectionConfig = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.recaptchaOptionsConfig = Codegen.empty();
        this.requestId = Codegen.empty();
        this.rules = Codegen.empty();
        this.type = Codegen.empty();
        this.validateOnly = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;
        private @Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig;
        private @Nullable Output<List<SecurityPolicyAssociationArgs>> associations;
        private @Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig;
        private @Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<SecurityPolicyRuleArgs>> rules;
        private @Nullable Output<SecurityPolicyType> type;
        private @Nullable Output<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveProtectionConfig = defaults.adaptiveProtectionConfig;
    	      this.advancedOptionsConfig = defaults.advancedOptionsConfig;
    	      this.associations = defaults.associations;
    	      this.cloudArmorConfig = defaults.cloudArmorConfig;
    	      this.ddosProtectionConfig = defaults.ddosProtectionConfig;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.recaptchaOptionsConfig = defaults.recaptchaOptionsConfig;
    	      this.requestId = defaults.requestId;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder adaptiveProtectionConfig(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = adaptiveProtectionConfig;
            return this;
        }
        public Builder adaptiveProtectionConfig(@Nullable SecurityPolicyAdaptiveProtectionConfigArgs adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = Codegen.ofNullable(adaptiveProtectionConfig);
            return this;
        }
        public Builder advancedOptionsConfig(@Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig) {
            this.advancedOptionsConfig = advancedOptionsConfig;
            return this;
        }
        public Builder advancedOptionsConfig(@Nullable SecurityPolicyAdvancedOptionsConfigArgs advancedOptionsConfig) {
            this.advancedOptionsConfig = Codegen.ofNullable(advancedOptionsConfig);
            return this;
        }
        public Builder associations(@Nullable Output<List<SecurityPolicyAssociationArgs>> associations) {
            this.associations = associations;
            return this;
        }
        public Builder associations(@Nullable List<SecurityPolicyAssociationArgs> associations) {
            this.associations = Codegen.ofNullable(associations);
            return this;
        }
        public Builder associations(SecurityPolicyAssociationArgs... associations) {
            return associations(List.of(associations));
        }
        public Builder cloudArmorConfig(@Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig) {
            this.cloudArmorConfig = cloudArmorConfig;
            return this;
        }
        public Builder cloudArmorConfig(@Nullable SecurityPolicyCloudArmorConfigArgs cloudArmorConfig) {
            this.cloudArmorConfig = Codegen.ofNullable(cloudArmorConfig);
            return this;
        }
        public Builder ddosProtectionConfig(@Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig) {
            this.ddosProtectionConfig = ddosProtectionConfig;
            return this;
        }
        public Builder ddosProtectionConfig(@Nullable SecurityPolicyDdosProtectionConfigArgs ddosProtectionConfig) {
            this.ddosProtectionConfig = Codegen.ofNullable(ddosProtectionConfig);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder recaptchaOptionsConfig(@Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig) {
            this.recaptchaOptionsConfig = recaptchaOptionsConfig;
            return this;
        }
        public Builder recaptchaOptionsConfig(@Nullable SecurityPolicyRecaptchaOptionsConfigArgs recaptchaOptionsConfig) {
            this.recaptchaOptionsConfig = Codegen.ofNullable(recaptchaOptionsConfig);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder rules(@Nullable Output<List<SecurityPolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<SecurityPolicyRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(SecurityPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder type(@Nullable Output<SecurityPolicyType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable SecurityPolicyType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }
        public Builder validateOnly(@Nullable String validateOnly) {
            this.validateOnly = Codegen.ofNullable(validateOnly);
            return this;
        }        public SecurityPolicyArgs build() {
            return new SecurityPolicyArgs(adaptiveProtectionConfig, advancedOptionsConfig, associations, cloudArmorConfig, ddosProtectionConfig, description, displayName, labels, name, project, recaptchaOptionsConfig, requestId, rules, type, validateOnly);
        }
    }
}
