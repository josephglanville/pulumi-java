// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.inputs;

import io.pulumi.aws.amplify.inputs.AppAutoBranchCreationConfigGetArgs;
import io.pulumi.aws.amplify.inputs.AppCustomRuleGetArgs;
import io.pulumi.aws.amplify.inputs.AppProductionBranchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppState extends io.pulumi.resources.ResourceArgs {

    public static final AppState Empty = new AppState();

    /**
     * The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable Output<String> accessToken;

    public Output<String> getAccessToken() {
        return this.accessToken == null ? Codegen.empty() : this.accessToken;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amplify app.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The automated branch creation configuration for an Amplify app. An `auto_branch_creation_config` block is documented below.
     * 
     */
    @Import(name="autoBranchCreationConfig")
      private final @Nullable Output<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig;

    public Output<AppAutoBranchCreationConfigGetArgs> getAutoBranchCreationConfig() {
        return this.autoBranchCreationConfig == null ? Codegen.empty() : this.autoBranchCreationConfig;
    }

    /**
     * The automated branch creation glob patterns for an Amplify app.
     * 
     */
    @Import(name="autoBranchCreationPatterns")
      private final @Nullable Output<List<String>> autoBranchCreationPatterns;

    public Output<List<String>> getAutoBranchCreationPatterns() {
        return this.autoBranchCreationPatterns == null ? Codegen.empty() : this.autoBranchCreationPatterns;
    }

    /**
     * The credentials for basic authorization for an Amplify app.
     * 
     */
    @Import(name="basicAuthCredentials")
      private final @Nullable Output<String> basicAuthCredentials;

    public Output<String> getBasicAuthCredentials() {
        return this.basicAuthCredentials == null ? Codegen.empty() : this.basicAuthCredentials;
    }

    /**
     * The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     * 
     */
    @Import(name="buildSpec")
      private final @Nullable Output<String> buildSpec;

    public Output<String> getBuildSpec() {
        return this.buildSpec == null ? Codegen.empty() : this.buildSpec;
    }

    /**
     * The custom rewrite and redirect rules for an Amplify app. A `custom_rule` block is documented below.
     * 
     */
    @Import(name="customRules")
      private final @Nullable Output<List<AppCustomRuleGetArgs>> customRules;

    public Output<List<AppCustomRuleGetArgs>> getCustomRules() {
        return this.customRules == null ? Codegen.empty() : this.customRules;
    }

    /**
     * The default domain for the Amplify app.
     * 
     */
    @Import(name="defaultDomain")
      private final @Nullable Output<String> defaultDomain;

    public Output<String> getDefaultDomain() {
        return this.defaultDomain == null ? Codegen.empty() : this.defaultDomain;
    }

    /**
     * The description for an Amplify app.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Enables automated branch creation for an Amplify app.
     * 
     */
    @Import(name="enableAutoBranchCreation")
      private final @Nullable Output<Boolean> enableAutoBranchCreation;

    public Output<Boolean> getEnableAutoBranchCreation() {
        return this.enableAutoBranchCreation == null ? Codegen.empty() : this.enableAutoBranchCreation;
    }

    /**
     * Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     * 
     */
    @Import(name="enableBasicAuth")
      private final @Nullable Output<Boolean> enableBasicAuth;

    public Output<Boolean> getEnableBasicAuth() {
        return this.enableBasicAuth == null ? Codegen.empty() : this.enableBasicAuth;
    }

    /**
     * Enables auto-building of branches for the Amplify App.
     * 
     */
    @Import(name="enableBranchAutoBuild")
      private final @Nullable Output<Boolean> enableBranchAutoBuild;

    public Output<Boolean> getEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild == null ? Codegen.empty() : this.enableBranchAutoBuild;
    }

    /**
     * Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     * 
     */
    @Import(name="enableBranchAutoDeletion")
      private final @Nullable Output<Boolean> enableBranchAutoDeletion;

    public Output<Boolean> getEnableBranchAutoDeletion() {
        return this.enableBranchAutoDeletion == null ? Codegen.empty() : this.enableBranchAutoDeletion;
    }

    /**
     * The environment variables map for an Amplify app.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<Map<String,String>> environmentVariables;

    public Output<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Codegen.empty() : this.environmentVariables;
    }

    /**
     * The AWS Identity and Access Management (IAM) service role for an Amplify app.
     * 
     */
    @Import(name="iamServiceRoleArn")
      private final @Nullable Output<String> iamServiceRoleArn;

    public Output<String> getIamServiceRoleArn() {
        return this.iamServiceRoleArn == null ? Codegen.empty() : this.iamServiceRoleArn;
    }

    /**
     * The name for an Amplify app.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     * 
     */
    @Import(name="oauthToken")
      private final @Nullable Output<String> oauthToken;

    public Output<String> getOauthToken() {
        return this.oauthToken == null ? Codegen.empty() : this.oauthToken;
    }

    /**
     * The platform or framework for an Amplify app. Valid values: `WEB`.
     * 
     */
    @Import(name="platform")
      private final @Nullable Output<String> platform;

    public Output<String> getPlatform() {
        return this.platform == null ? Codegen.empty() : this.platform;
    }

    /**
     * Describes the information about a production branch for an Amplify app. A `production_branch` block is documented below.
     * 
     */
    @Import(name="productionBranches")
      private final @Nullable Output<List<AppProductionBranchGetArgs>> productionBranches;

    public Output<List<AppProductionBranchGetArgs>> getProductionBranches() {
        return this.productionBranches == null ? Codegen.empty() : this.productionBranches;
    }

    /**
     * The repository for an Amplify app.
     * 
     */
    @Import(name="repository")
      private final @Nullable Output<String> repository;

    public Output<String> getRepository() {
        return this.repository == null ? Codegen.empty() : this.repository;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public AppState(
        @Nullable Output<String> accessToken,
        @Nullable Output<String> arn,
        @Nullable Output<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig,
        @Nullable Output<List<String>> autoBranchCreationPatterns,
        @Nullable Output<String> basicAuthCredentials,
        @Nullable Output<String> buildSpec,
        @Nullable Output<List<AppCustomRuleGetArgs>> customRules,
        @Nullable Output<String> defaultDomain,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableAutoBranchCreation,
        @Nullable Output<Boolean> enableBasicAuth,
        @Nullable Output<Boolean> enableBranchAutoBuild,
        @Nullable Output<Boolean> enableBranchAutoDeletion,
        @Nullable Output<Map<String,String>> environmentVariables,
        @Nullable Output<String> iamServiceRoleArn,
        @Nullable Output<String> name,
        @Nullable Output<String> oauthToken,
        @Nullable Output<String> platform,
        @Nullable Output<List<AppProductionBranchGetArgs>> productionBranches,
        @Nullable Output<String> repository,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.accessToken = accessToken;
        this.arn = arn;
        this.autoBranchCreationConfig = autoBranchCreationConfig;
        this.autoBranchCreationPatterns = autoBranchCreationPatterns;
        this.basicAuthCredentials = basicAuthCredentials;
        this.buildSpec = buildSpec;
        this.customRules = customRules;
        this.defaultDomain = defaultDomain;
        this.description = description;
        this.enableAutoBranchCreation = enableAutoBranchCreation;
        this.enableBasicAuth = enableBasicAuth;
        this.enableBranchAutoBuild = enableBranchAutoBuild;
        this.enableBranchAutoDeletion = enableBranchAutoDeletion;
        this.environmentVariables = environmentVariables;
        this.iamServiceRoleArn = iamServiceRoleArn;
        this.name = name;
        this.oauthToken = oauthToken;
        this.platform = platform;
        this.productionBranches = productionBranches;
        this.repository = repository;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private AppState() {
        this.accessToken = Codegen.empty();
        this.arn = Codegen.empty();
        this.autoBranchCreationConfig = Codegen.empty();
        this.autoBranchCreationPatterns = Codegen.empty();
        this.basicAuthCredentials = Codegen.empty();
        this.buildSpec = Codegen.empty();
        this.customRules = Codegen.empty();
        this.defaultDomain = Codegen.empty();
        this.description = Codegen.empty();
        this.enableAutoBranchCreation = Codegen.empty();
        this.enableBasicAuth = Codegen.empty();
        this.enableBranchAutoBuild = Codegen.empty();
        this.enableBranchAutoDeletion = Codegen.empty();
        this.environmentVariables = Codegen.empty();
        this.iamServiceRoleArn = Codegen.empty();
        this.name = Codegen.empty();
        this.oauthToken = Codegen.empty();
        this.platform = Codegen.empty();
        this.productionBranches = Codegen.empty();
        this.repository = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessToken;
        private @Nullable Output<String> arn;
        private @Nullable Output<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig;
        private @Nullable Output<List<String>> autoBranchCreationPatterns;
        private @Nullable Output<String> basicAuthCredentials;
        private @Nullable Output<String> buildSpec;
        private @Nullable Output<List<AppCustomRuleGetArgs>> customRules;
        private @Nullable Output<String> defaultDomain;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableAutoBranchCreation;
        private @Nullable Output<Boolean> enableBasicAuth;
        private @Nullable Output<Boolean> enableBranchAutoBuild;
        private @Nullable Output<Boolean> enableBranchAutoDeletion;
        private @Nullable Output<Map<String,String>> environmentVariables;
        private @Nullable Output<String> iamServiceRoleArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> oauthToken;
        private @Nullable Output<String> platform;
        private @Nullable Output<List<AppProductionBranchGetArgs>> productionBranches;
        private @Nullable Output<String> repository;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(AppState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.arn = defaults.arn;
    	      this.autoBranchCreationConfig = defaults.autoBranchCreationConfig;
    	      this.autoBranchCreationPatterns = defaults.autoBranchCreationPatterns;
    	      this.basicAuthCredentials = defaults.basicAuthCredentials;
    	      this.buildSpec = defaults.buildSpec;
    	      this.customRules = defaults.customRules;
    	      this.defaultDomain = defaults.defaultDomain;
    	      this.description = defaults.description;
    	      this.enableAutoBranchCreation = defaults.enableAutoBranchCreation;
    	      this.enableBasicAuth = defaults.enableBasicAuth;
    	      this.enableBranchAutoBuild = defaults.enableBranchAutoBuild;
    	      this.enableBranchAutoDeletion = defaults.enableBranchAutoDeletion;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.iamServiceRoleArn = defaults.iamServiceRoleArn;
    	      this.name = defaults.name;
    	      this.oauthToken = defaults.oauthToken;
    	      this.platform = defaults.platform;
    	      this.productionBranches = defaults.productionBranches;
    	      this.repository = defaults.repository;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = Codegen.ofNullable(accessToken);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder autoBranchCreationConfig(@Nullable Output<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig) {
            this.autoBranchCreationConfig = autoBranchCreationConfig;
            return this;
        }
        public Builder autoBranchCreationConfig(@Nullable AppAutoBranchCreationConfigGetArgs autoBranchCreationConfig) {
            this.autoBranchCreationConfig = Codegen.ofNullable(autoBranchCreationConfig);
            return this;
        }
        public Builder autoBranchCreationPatterns(@Nullable Output<List<String>> autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns = autoBranchCreationPatterns;
            return this;
        }
        public Builder autoBranchCreationPatterns(@Nullable List<String> autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns = Codegen.ofNullable(autoBranchCreationPatterns);
            return this;
        }
        public Builder autoBranchCreationPatterns(String... autoBranchCreationPatterns) {
            return autoBranchCreationPatterns(List.of(autoBranchCreationPatterns));
        }
        public Builder basicAuthCredentials(@Nullable Output<String> basicAuthCredentials) {
            this.basicAuthCredentials = basicAuthCredentials;
            return this;
        }
        public Builder basicAuthCredentials(@Nullable String basicAuthCredentials) {
            this.basicAuthCredentials = Codegen.ofNullable(basicAuthCredentials);
            return this;
        }
        public Builder buildSpec(@Nullable Output<String> buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }
        public Builder buildSpec(@Nullable String buildSpec) {
            this.buildSpec = Codegen.ofNullable(buildSpec);
            return this;
        }
        public Builder customRules(@Nullable Output<List<AppCustomRuleGetArgs>> customRules) {
            this.customRules = customRules;
            return this;
        }
        public Builder customRules(@Nullable List<AppCustomRuleGetArgs> customRules) {
            this.customRules = Codegen.ofNullable(customRules);
            return this;
        }
        public Builder customRules(AppCustomRuleGetArgs... customRules) {
            return customRules(List.of(customRules));
        }
        public Builder defaultDomain(@Nullable Output<String> defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }
        public Builder defaultDomain(@Nullable String defaultDomain) {
            this.defaultDomain = Codegen.ofNullable(defaultDomain);
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
        public Builder enableAutoBranchCreation(@Nullable Output<Boolean> enableAutoBranchCreation) {
            this.enableAutoBranchCreation = enableAutoBranchCreation;
            return this;
        }
        public Builder enableAutoBranchCreation(@Nullable Boolean enableAutoBranchCreation) {
            this.enableAutoBranchCreation = Codegen.ofNullable(enableAutoBranchCreation);
            return this;
        }
        public Builder enableBasicAuth(@Nullable Output<Boolean> enableBasicAuth) {
            this.enableBasicAuth = enableBasicAuth;
            return this;
        }
        public Builder enableBasicAuth(@Nullable Boolean enableBasicAuth) {
            this.enableBasicAuth = Codegen.ofNullable(enableBasicAuth);
            return this;
        }
        public Builder enableBranchAutoBuild(@Nullable Output<Boolean> enableBranchAutoBuild) {
            this.enableBranchAutoBuild = enableBranchAutoBuild;
            return this;
        }
        public Builder enableBranchAutoBuild(@Nullable Boolean enableBranchAutoBuild) {
            this.enableBranchAutoBuild = Codegen.ofNullable(enableBranchAutoBuild);
            return this;
        }
        public Builder enableBranchAutoDeletion(@Nullable Output<Boolean> enableBranchAutoDeletion) {
            this.enableBranchAutoDeletion = enableBranchAutoDeletion;
            return this;
        }
        public Builder enableBranchAutoDeletion(@Nullable Boolean enableBranchAutoDeletion) {
            this.enableBranchAutoDeletion = Codegen.ofNullable(enableBranchAutoDeletion);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Codegen.ofNullable(environmentVariables);
            return this;
        }
        public Builder iamServiceRoleArn(@Nullable Output<String> iamServiceRoleArn) {
            this.iamServiceRoleArn = iamServiceRoleArn;
            return this;
        }
        public Builder iamServiceRoleArn(@Nullable String iamServiceRoleArn) {
            this.iamServiceRoleArn = Codegen.ofNullable(iamServiceRoleArn);
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
        public Builder oauthToken(@Nullable Output<String> oauthToken) {
            this.oauthToken = oauthToken;
            return this;
        }
        public Builder oauthToken(@Nullable String oauthToken) {
            this.oauthToken = Codegen.ofNullable(oauthToken);
            return this;
        }
        public Builder platform(@Nullable Output<String> platform) {
            this.platform = platform;
            return this;
        }
        public Builder platform(@Nullable String platform) {
            this.platform = Codegen.ofNullable(platform);
            return this;
        }
        public Builder productionBranches(@Nullable Output<List<AppProductionBranchGetArgs>> productionBranches) {
            this.productionBranches = productionBranches;
            return this;
        }
        public Builder productionBranches(@Nullable List<AppProductionBranchGetArgs> productionBranches) {
            this.productionBranches = Codegen.ofNullable(productionBranches);
            return this;
        }
        public Builder productionBranches(AppProductionBranchGetArgs... productionBranches) {
            return productionBranches(List.of(productionBranches));
        }
        public Builder repository(@Nullable Output<String> repository) {
            this.repository = repository;
            return this;
        }
        public Builder repository(@Nullable String repository) {
            this.repository = Codegen.ofNullable(repository);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public AppState build() {
            return new AppState(accessToken, arn, autoBranchCreationConfig, autoBranchCreationPatterns, basicAuthCredentials, buildSpec, customRules, defaultDomain, description, enableAutoBranchCreation, enableBasicAuth, enableBranchAutoBuild, enableBranchAutoDeletion, environmentVariables, iamServiceRoleArn, name, oauthToken, platform, productionBranches, repository, tags, tagsAll);
        }
    }
}
