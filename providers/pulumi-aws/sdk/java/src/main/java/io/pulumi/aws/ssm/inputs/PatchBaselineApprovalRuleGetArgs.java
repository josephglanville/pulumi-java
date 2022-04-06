// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.PatchBaselineApprovalRulePatchFilterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchBaselineApprovalRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchBaselineApprovalRuleGetArgs Empty = new PatchBaselineApprovalRuleGetArgs();

    /**
     * The number of days after the release date of each patch matched by the rule the patch is marked as approved in the patch baseline. Valid Range: 0 to 100. Conflicts with `approve_until_date`
     * 
     */
    @Import(name="approveAfterDays")
      private final @Nullable Output<Integer> approveAfterDays;

    public Output<Integer> getApproveAfterDays() {
        return this.approveAfterDays == null ? Output.empty() : this.approveAfterDays;
    }

    /**
     * The cutoff date for auto approval of released patches. Any patches released on or before this date are installed automatically. Date is formatted as `YYYY-MM-DD`. Conflicts with `approve_after_days`
     * 
     */
    @Import(name="approveUntilDate")
      private final @Nullable Output<String> approveUntilDate;

    public Output<String> getApproveUntilDate() {
        return this.approveUntilDate == null ? Output.empty() : this.approveUntilDate;
    }

    /**
     * Defines the compliance level for patches approved by this rule. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    @Import(name="complianceLevel")
      private final @Nullable Output<String> complianceLevel;

    public Output<String> getComplianceLevel() {
        return this.complianceLevel == null ? Output.empty() : this.complianceLevel;
    }

    /**
     * Boolean enabling the application of non-security updates. The default value is 'false'. Valid for Linux instances only.
     * 
     */
    @Import(name="enableNonSecurity")
      private final @Nullable Output<Boolean> enableNonSecurity;

    public Output<Boolean> getEnableNonSecurity() {
        return this.enableNonSecurity == null ? Output.empty() : this.enableNonSecurity;
    }

    /**
     * The patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid Keys are `PATCH_SET | PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`. Valid combinations of these Keys and the `operating_system` value can be found in the [SSM DescribePatchProperties API Reference](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html). Valid Values are exact values for the patch property given as the key, or a wildcard `*`, which matches all values.
     * 
     */
    @Import(name="patchFilters", required=true)
      private final Output<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters;

    public Output<List<PatchBaselineApprovalRulePatchFilterGetArgs>> getPatchFilters() {
        return this.patchFilters;
    }

    public PatchBaselineApprovalRuleGetArgs(
        @Nullable Output<Integer> approveAfterDays,
        @Nullable Output<String> approveUntilDate,
        @Nullable Output<String> complianceLevel,
        @Nullable Output<Boolean> enableNonSecurity,
        Output<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters) {
        this.approveAfterDays = approveAfterDays;
        this.approveUntilDate = approveUntilDate;
        this.complianceLevel = complianceLevel;
        this.enableNonSecurity = enableNonSecurity;
        this.patchFilters = Objects.requireNonNull(patchFilters, "expected parameter 'patchFilters' to be non-null");
    }

    private PatchBaselineApprovalRuleGetArgs() {
        this.approveAfterDays = Output.empty();
        this.approveUntilDate = Output.empty();
        this.complianceLevel = Output.empty();
        this.enableNonSecurity = Output.empty();
        this.patchFilters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchBaselineApprovalRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> approveAfterDays;
        private @Nullable Output<String> approveUntilDate;
        private @Nullable Output<String> complianceLevel;
        private @Nullable Output<Boolean> enableNonSecurity;
        private Output<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchBaselineApprovalRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approveAfterDays = defaults.approveAfterDays;
    	      this.approveUntilDate = defaults.approveUntilDate;
    	      this.complianceLevel = defaults.complianceLevel;
    	      this.enableNonSecurity = defaults.enableNonSecurity;
    	      this.patchFilters = defaults.patchFilters;
        }

        public Builder approveAfterDays(@Nullable Output<Integer> approveAfterDays) {
            this.approveAfterDays = approveAfterDays;
            return this;
        }
        public Builder approveAfterDays(@Nullable Integer approveAfterDays) {
            this.approveAfterDays = Output.ofNullable(approveAfterDays);
            return this;
        }
        public Builder approveUntilDate(@Nullable Output<String> approveUntilDate) {
            this.approveUntilDate = approveUntilDate;
            return this;
        }
        public Builder approveUntilDate(@Nullable String approveUntilDate) {
            this.approveUntilDate = Output.ofNullable(approveUntilDate);
            return this;
        }
        public Builder complianceLevel(@Nullable Output<String> complianceLevel) {
            this.complianceLevel = complianceLevel;
            return this;
        }
        public Builder complianceLevel(@Nullable String complianceLevel) {
            this.complianceLevel = Output.ofNullable(complianceLevel);
            return this;
        }
        public Builder enableNonSecurity(@Nullable Output<Boolean> enableNonSecurity) {
            this.enableNonSecurity = enableNonSecurity;
            return this;
        }
        public Builder enableNonSecurity(@Nullable Boolean enableNonSecurity) {
            this.enableNonSecurity = Output.ofNullable(enableNonSecurity);
            return this;
        }
        public Builder patchFilters(Output<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters) {
            this.patchFilters = Objects.requireNonNull(patchFilters);
            return this;
        }
        public Builder patchFilters(List<PatchBaselineApprovalRulePatchFilterGetArgs> patchFilters) {
            this.patchFilters = Output.of(Objects.requireNonNull(patchFilters));
            return this;
        }
        public Builder patchFilters(PatchBaselineApprovalRulePatchFilterGetArgs... patchFilters) {
            return patchFilters(List.of(patchFilters));
        }        public PatchBaselineApprovalRuleGetArgs build() {
            return new PatchBaselineApprovalRuleGetArgs(approveAfterDays, approveUntilDate, complianceLevel, enableNonSecurity, patchFilters);
        }
    }
}