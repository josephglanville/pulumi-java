// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSecurityAssessmentsSecurityAssessmentStatisticPass {
    /**
     * @return The number of findings in the Auditing category.
     * 
     */
    private final Integer auditingFindingsCount;
    /**
     * @return The number of findings in the Authorization Control category.
     * 
     */
    private final Integer authorizationControlFindingsCount;
    /**
     * @return The number of findings in the Data Encryption category.
     * 
     */
    private final Integer dataEncryptionFindingsCount;
    /**
     * @return The number of findings in the Database Configuration category.
     * 
     */
    private final Integer dbConfigurationFindingsCount;
    /**
     * @return The number of findings in the Fine-Grained Access Control category.
     * 
     */
    private final Integer fineGrainedAccessControlFindingsCount;
    /**
     * @return The number of findings in the Privileges and Roles category.
     * 
     */
    private final Integer privilegesAndRolesFindingsCount;
    /**
     * @return The total number of targets in this security assessment.
     * 
     */
    private final Integer targetsCount;
    /**
     * @return The number of findings in the User Accounts category.
     * 
     */
    private final Integer userAccountsFindingsCount;

    @CustomType.Constructor
    private GetSecurityAssessmentsSecurityAssessmentStatisticPass(
        @CustomType.Parameter("auditingFindingsCount") Integer auditingFindingsCount,
        @CustomType.Parameter("authorizationControlFindingsCount") Integer authorizationControlFindingsCount,
        @CustomType.Parameter("dataEncryptionFindingsCount") Integer dataEncryptionFindingsCount,
        @CustomType.Parameter("dbConfigurationFindingsCount") Integer dbConfigurationFindingsCount,
        @CustomType.Parameter("fineGrainedAccessControlFindingsCount") Integer fineGrainedAccessControlFindingsCount,
        @CustomType.Parameter("privilegesAndRolesFindingsCount") Integer privilegesAndRolesFindingsCount,
        @CustomType.Parameter("targetsCount") Integer targetsCount,
        @CustomType.Parameter("userAccountsFindingsCount") Integer userAccountsFindingsCount) {
        this.auditingFindingsCount = auditingFindingsCount;
        this.authorizationControlFindingsCount = authorizationControlFindingsCount;
        this.dataEncryptionFindingsCount = dataEncryptionFindingsCount;
        this.dbConfigurationFindingsCount = dbConfigurationFindingsCount;
        this.fineGrainedAccessControlFindingsCount = fineGrainedAccessControlFindingsCount;
        this.privilegesAndRolesFindingsCount = privilegesAndRolesFindingsCount;
        this.targetsCount = targetsCount;
        this.userAccountsFindingsCount = userAccountsFindingsCount;
    }

    /**
     * @return The number of findings in the Auditing category.
     * 
     */
    public Integer auditingFindingsCount() {
        return this.auditingFindingsCount;
    }
    /**
     * @return The number of findings in the Authorization Control category.
     * 
     */
    public Integer authorizationControlFindingsCount() {
        return this.authorizationControlFindingsCount;
    }
    /**
     * @return The number of findings in the Data Encryption category.
     * 
     */
    public Integer dataEncryptionFindingsCount() {
        return this.dataEncryptionFindingsCount;
    }
    /**
     * @return The number of findings in the Database Configuration category.
     * 
     */
    public Integer dbConfigurationFindingsCount() {
        return this.dbConfigurationFindingsCount;
    }
    /**
     * @return The number of findings in the Fine-Grained Access Control category.
     * 
     */
    public Integer fineGrainedAccessControlFindingsCount() {
        return this.fineGrainedAccessControlFindingsCount;
    }
    /**
     * @return The number of findings in the Privileges and Roles category.
     * 
     */
    public Integer privilegesAndRolesFindingsCount() {
        return this.privilegesAndRolesFindingsCount;
    }
    /**
     * @return The total number of targets in this security assessment.
     * 
     */
    public Integer targetsCount() {
        return this.targetsCount;
    }
    /**
     * @return The number of findings in the User Accounts category.
     * 
     */
    public Integer userAccountsFindingsCount() {
        return this.userAccountsFindingsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityAssessmentsSecurityAssessmentStatisticPass defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer auditingFindingsCount;
        private Integer authorizationControlFindingsCount;
        private Integer dataEncryptionFindingsCount;
        private Integer dbConfigurationFindingsCount;
        private Integer fineGrainedAccessControlFindingsCount;
        private Integer privilegesAndRolesFindingsCount;
        private Integer targetsCount;
        private Integer userAccountsFindingsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityAssessmentsSecurityAssessmentStatisticPass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditingFindingsCount = defaults.auditingFindingsCount;
    	      this.authorizationControlFindingsCount = defaults.authorizationControlFindingsCount;
    	      this.dataEncryptionFindingsCount = defaults.dataEncryptionFindingsCount;
    	      this.dbConfigurationFindingsCount = defaults.dbConfigurationFindingsCount;
    	      this.fineGrainedAccessControlFindingsCount = defaults.fineGrainedAccessControlFindingsCount;
    	      this.privilegesAndRolesFindingsCount = defaults.privilegesAndRolesFindingsCount;
    	      this.targetsCount = defaults.targetsCount;
    	      this.userAccountsFindingsCount = defaults.userAccountsFindingsCount;
        }

        public Builder auditingFindingsCount(Integer auditingFindingsCount) {
            this.auditingFindingsCount = Objects.requireNonNull(auditingFindingsCount);
            return this;
        }
        public Builder authorizationControlFindingsCount(Integer authorizationControlFindingsCount) {
            this.authorizationControlFindingsCount = Objects.requireNonNull(authorizationControlFindingsCount);
            return this;
        }
        public Builder dataEncryptionFindingsCount(Integer dataEncryptionFindingsCount) {
            this.dataEncryptionFindingsCount = Objects.requireNonNull(dataEncryptionFindingsCount);
            return this;
        }
        public Builder dbConfigurationFindingsCount(Integer dbConfigurationFindingsCount) {
            this.dbConfigurationFindingsCount = Objects.requireNonNull(dbConfigurationFindingsCount);
            return this;
        }
        public Builder fineGrainedAccessControlFindingsCount(Integer fineGrainedAccessControlFindingsCount) {
            this.fineGrainedAccessControlFindingsCount = Objects.requireNonNull(fineGrainedAccessControlFindingsCount);
            return this;
        }
        public Builder privilegesAndRolesFindingsCount(Integer privilegesAndRolesFindingsCount) {
            this.privilegesAndRolesFindingsCount = Objects.requireNonNull(privilegesAndRolesFindingsCount);
            return this;
        }
        public Builder targetsCount(Integer targetsCount) {
            this.targetsCount = Objects.requireNonNull(targetsCount);
            return this;
        }
        public Builder userAccountsFindingsCount(Integer userAccountsFindingsCount) {
            this.userAccountsFindingsCount = Objects.requireNonNull(userAccountsFindingsCount);
            return this;
        }        public GetSecurityAssessmentsSecurityAssessmentStatisticPass build() {
            return new GetSecurityAssessmentsSecurityAssessmentStatisticPass(auditingFindingsCount, authorizationControlFindingsCount, dataEncryptionFindingsCount, dbConfigurationFindingsCount, fineGrainedAccessControlFindingsCount, privilegesAndRolesFindingsCount, targetsCount, userAccountsFindingsCount);
        }
    }
}
