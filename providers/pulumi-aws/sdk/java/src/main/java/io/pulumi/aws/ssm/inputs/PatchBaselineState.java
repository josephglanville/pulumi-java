// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleGetArgs;
import io.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterGetArgs;
import io.pulumi.aws.ssm.inputs.PatchBaselineSourceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchBaselineState extends io.pulumi.resources.ResourceArgs {

    public static final PatchBaselineState Empty = new PatchBaselineState();

    /**
     * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approval_rule block requires the fields documented below.
     * 
     */
    @Import(name="approvalRules")
      private final @Nullable Output<List<PatchBaselineApprovalRuleGetArgs>> approvalRules;

    public Output<List<PatchBaselineApprovalRuleGetArgs>> getApprovalRules() {
        return this.approvalRules == null ? Output.empty() : this.approvalRules;
    }

    /**
     * A list of explicitly approved patches for the baseline.
     * 
     */
    @Import(name="approvedPatches")
      private final @Nullable Output<List<String>> approvedPatches;

    public Output<List<String>> getApprovedPatches() {
        return this.approvedPatches == null ? Output.empty() : this.approvedPatches;
    }

    /**
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    @Import(name="approvedPatchesComplianceLevel")
      private final @Nullable Output<String> approvedPatchesComplianceLevel;

    public Output<String> getApprovedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel == null ? Output.empty() : this.approvedPatchesComplianceLevel;
    }

    /**
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. Applies to Linux instances only.
     * 
     */
    @Import(name="approvedPatchesEnableNonSecurity")
      private final @Nullable Output<Boolean> approvedPatchesEnableNonSecurity;

    public Output<Boolean> getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity == null ? Output.empty() : this.approvedPatchesEnableNonSecurity;
    }

    /**
     * The ARN of the patch baseline.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The description of the patch baseline.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
     * 
     */
    @Import(name="globalFilters")
      private final @Nullable Output<List<PatchBaselineGlobalFilterGetArgs>> globalFilters;

    public Output<List<PatchBaselineGlobalFilterGetArgs>> getGlobalFilters() {
        return this.globalFilters == null ? Output.empty() : this.globalFilters;
    }

    /**
     * The name specified to identify the patch source.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
     * 
     */
    @Import(name="operatingSystem")
      private final @Nullable Output<String> operatingSystem;

    public Output<String> getOperatingSystem() {
        return this.operatingSystem == null ? Output.empty() : this.operatingSystem;
    }

    /**
     * A list of rejected patches.
     * 
     */
    @Import(name="rejectedPatches")
      private final @Nullable Output<List<String>> rejectedPatches;

    public Output<List<String>> getRejectedPatches() {
        return this.rejectedPatches == null ? Output.empty() : this.rejectedPatches;
    }

    /**
     * The action for Patch Manager to take on patches included in the `rejected_patches` list. Allow values are `ALLOW_AS_DEPENDENCY` and `BLOCK`.
     * 
     */
    @Import(name="rejectedPatchesAction")
      private final @Nullable Output<String> rejectedPatchesAction;

    public Output<String> getRejectedPatchesAction() {
        return this.rejectedPatchesAction == null ? Output.empty() : this.rejectedPatchesAction;
    }

    /**
     * Configuration block(s) with alternate sources for patches. Applies to Linux instances only. Documented below.
     * 
     */
    @Import(name="sources")
      private final @Nullable Output<List<PatchBaselineSourceGetArgs>> sources;

    public Output<List<PatchBaselineSourceGetArgs>> getSources() {
        return this.sources == null ? Output.empty() : this.sources;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public PatchBaselineState(
        @Nullable Output<List<PatchBaselineApprovalRuleGetArgs>> approvalRules,
        @Nullable Output<List<String>> approvedPatches,
        @Nullable Output<String> approvedPatchesComplianceLevel,
        @Nullable Output<Boolean> approvedPatchesEnableNonSecurity,
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<List<PatchBaselineGlobalFilterGetArgs>> globalFilters,
        @Nullable Output<String> name,
        @Nullable Output<String> operatingSystem,
        @Nullable Output<List<String>> rejectedPatches,
        @Nullable Output<String> rejectedPatchesAction,
        @Nullable Output<List<PatchBaselineSourceGetArgs>> sources,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.approvalRules = approvalRules;
        this.approvedPatches = approvedPatches;
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        this.arn = arn;
        this.description = description;
        this.globalFilters = globalFilters;
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.rejectedPatches = rejectedPatches;
        this.rejectedPatchesAction = rejectedPatchesAction;
        this.sources = sources;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private PatchBaselineState() {
        this.approvalRules = Output.empty();
        this.approvedPatches = Output.empty();
        this.approvedPatchesComplianceLevel = Output.empty();
        this.approvedPatchesEnableNonSecurity = Output.empty();
        this.arn = Output.empty();
        this.description = Output.empty();
        this.globalFilters = Output.empty();
        this.name = Output.empty();
        this.operatingSystem = Output.empty();
        this.rejectedPatches = Output.empty();
        this.rejectedPatchesAction = Output.empty();
        this.sources = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchBaselineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PatchBaselineApprovalRuleGetArgs>> approvalRules;
        private @Nullable Output<List<String>> approvedPatches;
        private @Nullable Output<String> approvedPatchesComplianceLevel;
        private @Nullable Output<Boolean> approvedPatchesEnableNonSecurity;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<List<PatchBaselineGlobalFilterGetArgs>> globalFilters;
        private @Nullable Output<String> name;
        private @Nullable Output<String> operatingSystem;
        private @Nullable Output<List<String>> rejectedPatches;
        private @Nullable Output<String> rejectedPatchesAction;
        private @Nullable Output<List<PatchBaselineSourceGetArgs>> sources;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchBaselineState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRules = defaults.approvalRules;
    	      this.approvedPatches = defaults.approvedPatches;
    	      this.approvedPatchesComplianceLevel = defaults.approvedPatchesComplianceLevel;
    	      this.approvedPatchesEnableNonSecurity = defaults.approvedPatchesEnableNonSecurity;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.globalFilters = defaults.globalFilters;
    	      this.name = defaults.name;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.rejectedPatches = defaults.rejectedPatches;
    	      this.rejectedPatchesAction = defaults.rejectedPatchesAction;
    	      this.sources = defaults.sources;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder approvalRules(@Nullable Output<List<PatchBaselineApprovalRuleGetArgs>> approvalRules) {
            this.approvalRules = approvalRules;
            return this;
        }
        public Builder approvalRules(@Nullable List<PatchBaselineApprovalRuleGetArgs> approvalRules) {
            this.approvalRules = Output.ofNullable(approvalRules);
            return this;
        }
        public Builder approvalRules(PatchBaselineApprovalRuleGetArgs... approvalRules) {
            return approvalRules(List.of(approvalRules));
        }
        public Builder approvedPatches(@Nullable Output<List<String>> approvedPatches) {
            this.approvedPatches = approvedPatches;
            return this;
        }
        public Builder approvedPatches(@Nullable List<String> approvedPatches) {
            this.approvedPatches = Output.ofNullable(approvedPatches);
            return this;
        }
        public Builder approvedPatches(String... approvedPatches) {
            return approvedPatches(List.of(approvedPatches));
        }
        public Builder approvedPatchesComplianceLevel(@Nullable Output<String> approvedPatchesComplianceLevel) {
            this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
            return this;
        }
        public Builder approvedPatchesComplianceLevel(@Nullable String approvedPatchesComplianceLevel) {
            this.approvedPatchesComplianceLevel = Output.ofNullable(approvedPatchesComplianceLevel);
            return this;
        }
        public Builder approvedPatchesEnableNonSecurity(@Nullable Output<Boolean> approvedPatchesEnableNonSecurity) {
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }
        public Builder approvedPatchesEnableNonSecurity(@Nullable Boolean approvedPatchesEnableNonSecurity) {
            this.approvedPatchesEnableNonSecurity = Output.ofNullable(approvedPatchesEnableNonSecurity);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder globalFilters(@Nullable Output<List<PatchBaselineGlobalFilterGetArgs>> globalFilters) {
            this.globalFilters = globalFilters;
            return this;
        }
        public Builder globalFilters(@Nullable List<PatchBaselineGlobalFilterGetArgs> globalFilters) {
            this.globalFilters = Output.ofNullable(globalFilters);
            return this;
        }
        public Builder globalFilters(PatchBaselineGlobalFilterGetArgs... globalFilters) {
            return globalFilters(List.of(globalFilters));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder operatingSystem(@Nullable Output<String> operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public Builder operatingSystem(@Nullable String operatingSystem) {
            this.operatingSystem = Output.ofNullable(operatingSystem);
            return this;
        }
        public Builder rejectedPatches(@Nullable Output<List<String>> rejectedPatches) {
            this.rejectedPatches = rejectedPatches;
            return this;
        }
        public Builder rejectedPatches(@Nullable List<String> rejectedPatches) {
            this.rejectedPatches = Output.ofNullable(rejectedPatches);
            return this;
        }
        public Builder rejectedPatches(String... rejectedPatches) {
            return rejectedPatches(List.of(rejectedPatches));
        }
        public Builder rejectedPatchesAction(@Nullable Output<String> rejectedPatchesAction) {
            this.rejectedPatchesAction = rejectedPatchesAction;
            return this;
        }
        public Builder rejectedPatchesAction(@Nullable String rejectedPatchesAction) {
            this.rejectedPatchesAction = Output.ofNullable(rejectedPatchesAction);
            return this;
        }
        public Builder sources(@Nullable Output<List<PatchBaselineSourceGetArgs>> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(@Nullable List<PatchBaselineSourceGetArgs> sources) {
            this.sources = Output.ofNullable(sources);
            return this;
        }
        public Builder sources(PatchBaselineSourceGetArgs... sources) {
            return sources(List.of(sources));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public PatchBaselineState build() {
            return new PatchBaselineState(approvalRules, approvedPatches, approvedPatchesComplianceLevel, approvedPatchesEnableNonSecurity, arn, description, globalFilters, name, operatingSystem, rejectedPatches, rejectedPatchesAction, sources, tags, tagsAll);
        }
    }
}