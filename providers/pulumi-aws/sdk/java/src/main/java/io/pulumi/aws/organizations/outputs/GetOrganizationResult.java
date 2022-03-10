// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.outputs;

import io.pulumi.aws.organizations.outputs.GetOrganizationAccount;
import io.pulumi.aws.organizations.outputs.GetOrganizationNonMasterAccount;
import io.pulumi.aws.organizations.outputs.GetOrganizationRoot;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationResult {
    /**
     * List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
     * 
     */
    private final List<GetOrganizationAccount> accounts;
    /**
     * ARN of the root
     * 
     */
    private final String arn;
    /**
     * A list of AWS service principal names that have integration enabled with your organization. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
     * 
     */
    private final List<String> awsServiceAccessPrincipals;
    /**
     * A list of Organizations policy types that are enabled in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `SERVICE_CONTROL_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
     * 
     */
    private final List<String> enabledPolicyTypes;
    /**
     * The FeatureSet of the organization.
     * 
     */
    private final String featureSet;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * 
     */
    private final String masterAccountArn;
    /**
     * The email address that is associated with the AWS account that is designated as the master account for the organization.
     * 
     */
    private final String masterAccountEmail;
    /**
     * The unique identifier (ID) of the master account of an organization.
     * 
     */
    private final String masterAccountId;
    /**
     * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
     * 
     */
    private final List<GetOrganizationNonMasterAccount> nonMasterAccounts;
    /**
     * List of organization roots. All elements have these attributes:
     * 
     */
    private final List<GetOrganizationRoot> roots;

    @OutputCustomType.Constructor
    private GetOrganizationResult(
        @OutputCustomType.Parameter("accounts") List<GetOrganizationAccount> accounts,
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("awsServiceAccessPrincipals") List<String> awsServiceAccessPrincipals,
        @OutputCustomType.Parameter("enabledPolicyTypes") List<String> enabledPolicyTypes,
        @OutputCustomType.Parameter("featureSet") String featureSet,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("masterAccountArn") String masterAccountArn,
        @OutputCustomType.Parameter("masterAccountEmail") String masterAccountEmail,
        @OutputCustomType.Parameter("masterAccountId") String masterAccountId,
        @OutputCustomType.Parameter("nonMasterAccounts") List<GetOrganizationNonMasterAccount> nonMasterAccounts,
        @OutputCustomType.Parameter("roots") List<GetOrganizationRoot> roots) {
        this.accounts = accounts;
        this.arn = arn;
        this.awsServiceAccessPrincipals = awsServiceAccessPrincipals;
        this.enabledPolicyTypes = enabledPolicyTypes;
        this.featureSet = featureSet;
        this.id = id;
        this.masterAccountArn = masterAccountArn;
        this.masterAccountEmail = masterAccountEmail;
        this.masterAccountId = masterAccountId;
        this.nonMasterAccounts = nonMasterAccounts;
        this.roots = roots;
    }

    /**
     * List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
     * 
    */
    public List<GetOrganizationAccount> getAccounts() {
        return this.accounts;
    }
    /**
     * ARN of the root
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * A list of AWS service principal names that have integration enabled with your organization. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
     * 
    */
    public List<String> getAwsServiceAccessPrincipals() {
        return this.awsServiceAccessPrincipals;
    }
    /**
     * A list of Organizations policy types that are enabled in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `SERVICE_CONTROL_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
     * 
    */
    public List<String> getEnabledPolicyTypes() {
        return this.enabledPolicyTypes;
    }
    /**
     * The FeatureSet of the organization.
     * 
    */
    public String getFeatureSet() {
        return this.featureSet;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * 
    */
    public String getMasterAccountArn() {
        return this.masterAccountArn;
    }
    /**
     * The email address that is associated with the AWS account that is designated as the master account for the organization.
     * 
    */
    public String getMasterAccountEmail() {
        return this.masterAccountEmail;
    }
    /**
     * The unique identifier (ID) of the master account of an organization.
     * 
    */
    public String getMasterAccountId() {
        return this.masterAccountId;
    }
    /**
     * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
     * 
    */
    public List<GetOrganizationNonMasterAccount> getNonMasterAccounts() {
        return this.nonMasterAccounts;
    }
    /**
     * List of organization roots. All elements have these attributes:
     * 
    */
    public List<GetOrganizationRoot> getRoots() {
        return this.roots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetOrganizationAccount> accounts;
        private String arn;
        private List<String> awsServiceAccessPrincipals;
        private List<String> enabledPolicyTypes;
        private String featureSet;
        private String id;
        private String masterAccountArn;
        private String masterAccountEmail;
        private String masterAccountId;
        private List<GetOrganizationNonMasterAccount> nonMasterAccounts;
        private List<GetOrganizationRoot> roots;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.arn = defaults.arn;
    	      this.awsServiceAccessPrincipals = defaults.awsServiceAccessPrincipals;
    	      this.enabledPolicyTypes = defaults.enabledPolicyTypes;
    	      this.featureSet = defaults.featureSet;
    	      this.id = defaults.id;
    	      this.masterAccountArn = defaults.masterAccountArn;
    	      this.masterAccountEmail = defaults.masterAccountEmail;
    	      this.masterAccountId = defaults.masterAccountId;
    	      this.nonMasterAccounts = defaults.nonMasterAccounts;
    	      this.roots = defaults.roots;
        }

        public Builder setAccounts(List<GetOrganizationAccount> accounts) {
            this.accounts = Objects.requireNonNull(accounts);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAwsServiceAccessPrincipals(List<String> awsServiceAccessPrincipals) {
            this.awsServiceAccessPrincipals = Objects.requireNonNull(awsServiceAccessPrincipals);
            return this;
        }

        public Builder setEnabledPolicyTypes(List<String> enabledPolicyTypes) {
            this.enabledPolicyTypes = Objects.requireNonNull(enabledPolicyTypes);
            return this;
        }

        public Builder setFeatureSet(String featureSet) {
            this.featureSet = Objects.requireNonNull(featureSet);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMasterAccountArn(String masterAccountArn) {
            this.masterAccountArn = Objects.requireNonNull(masterAccountArn);
            return this;
        }

        public Builder setMasterAccountEmail(String masterAccountEmail) {
            this.masterAccountEmail = Objects.requireNonNull(masterAccountEmail);
            return this;
        }

        public Builder setMasterAccountId(String masterAccountId) {
            this.masterAccountId = Objects.requireNonNull(masterAccountId);
            return this;
        }

        public Builder setNonMasterAccounts(List<GetOrganizationNonMasterAccount> nonMasterAccounts) {
            this.nonMasterAccounts = Objects.requireNonNull(nonMasterAccounts);
            return this;
        }

        public Builder setRoots(List<GetOrganizationRoot> roots) {
            this.roots = Objects.requireNonNull(roots);
            return this;
        }
        public GetOrganizationResult build() {
            return new GetOrganizationResult(accounts, arn, awsServiceAccessPrincipals, enabledPolicyTypes, featureSet, id, masterAccountArn, masterAccountEmail, masterAccountId, nonMasterAccounts, roots);
        }
    }
}
