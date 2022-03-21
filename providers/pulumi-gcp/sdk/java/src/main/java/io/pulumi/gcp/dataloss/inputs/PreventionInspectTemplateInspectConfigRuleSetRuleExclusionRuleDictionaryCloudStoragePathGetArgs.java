// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs();

    /**
     * A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs(Output<String> path) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs() {
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs(path);
        }
    }
}
