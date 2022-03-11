// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DelegatedAdministratorState extends io.pulumi.resources.ResourceArgs {

    public static final DelegatedAdministratorState Empty = new DelegatedAdministratorState();

    /**
     * The account ID number of the member account in the organization to register as a delegated administrator.
     * 
     */
    @InputImport(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Output.empty() : this.accountId;
    }

    /**
     * The Amazon Resource Name (ARN) of the delegated administrator's account.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The date when the account was made a delegated administrator.
     * 
     */
    @InputImport(name="delegationEnabledDate")
      private final @Nullable Output<String> delegationEnabledDate;

    public Output<String> getDelegationEnabledDate() {
        return this.delegationEnabledDate == null ? Output.empty() : this.delegationEnabledDate;
    }

    /**
     * The email address that is associated with the delegated administrator's AWS account.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Output.empty() : this.email;
    }

    /**
     * The method by which the delegated administrator's account joined the organization.
     * 
     */
    @InputImport(name="joinedMethod")
      private final @Nullable Output<String> joinedMethod;

    public Output<String> getJoinedMethod() {
        return this.joinedMethod == null ? Output.empty() : this.joinedMethod;
    }

    /**
     * The date when the delegated administrator's account became a part of the organization.
     * 
     */
    @InputImport(name="joinedTimestamp")
      private final @Nullable Output<String> joinedTimestamp;

    public Output<String> getJoinedTimestamp() {
        return this.joinedTimestamp == null ? Output.empty() : this.joinedTimestamp;
    }

    /**
     * The friendly name of the delegated administrator's account.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The service principal of the AWS service for which you want to make the member account a delegated administrator.
     * 
     */
    @InputImport(name="servicePrincipal")
      private final @Nullable Output<String> servicePrincipal;

    public Output<String> getServicePrincipal() {
        return this.servicePrincipal == null ? Output.empty() : this.servicePrincipal;
    }

    /**
     * The status of the delegated administrator's account in the organization.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public DelegatedAdministratorState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> arn,
        @Nullable Output<String> delegationEnabledDate,
        @Nullable Output<String> email,
        @Nullable Output<String> joinedMethod,
        @Nullable Output<String> joinedTimestamp,
        @Nullable Output<String> name,
        @Nullable Output<String> servicePrincipal,
        @Nullable Output<String> status) {
        this.accountId = accountId;
        this.arn = arn;
        this.delegationEnabledDate = delegationEnabledDate;
        this.email = email;
        this.joinedMethod = joinedMethod;
        this.joinedTimestamp = joinedTimestamp;
        this.name = name;
        this.servicePrincipal = servicePrincipal;
        this.status = status;
    }

    private DelegatedAdministratorState() {
        this.accountId = Output.empty();
        this.arn = Output.empty();
        this.delegationEnabledDate = Output.empty();
        this.email = Output.empty();
        this.joinedMethod = Output.empty();
        this.joinedTimestamp = Output.empty();
        this.name = Output.empty();
        this.servicePrincipal = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelegatedAdministratorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> delegationEnabledDate;
        private @Nullable Output<String> email;
        private @Nullable Output<String> joinedMethod;
        private @Nullable Output<String> joinedTimestamp;
        private @Nullable Output<String> name;
        private @Nullable Output<String> servicePrincipal;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(DelegatedAdministratorState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.arn = defaults.arn;
    	      this.delegationEnabledDate = defaults.delegationEnabledDate;
    	      this.email = defaults.email;
    	      this.joinedMethod = defaults.joinedMethod;
    	      this.joinedTimestamp = defaults.joinedTimestamp;
    	      this.name = defaults.name;
    	      this.servicePrincipal = defaults.servicePrincipal;
    	      this.status = defaults.status;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = Output.ofNullable(accountId);
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

        public Builder delegationEnabledDate(@Nullable Output<String> delegationEnabledDate) {
            this.delegationEnabledDate = delegationEnabledDate;
            return this;
        }

        public Builder delegationEnabledDate(@Nullable String delegationEnabledDate) {
            this.delegationEnabledDate = Output.ofNullable(delegationEnabledDate);
            return this;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Output.ofNullable(email);
            return this;
        }

        public Builder joinedMethod(@Nullable Output<String> joinedMethod) {
            this.joinedMethod = joinedMethod;
            return this;
        }

        public Builder joinedMethod(@Nullable String joinedMethod) {
            this.joinedMethod = Output.ofNullable(joinedMethod);
            return this;
        }

        public Builder joinedTimestamp(@Nullable Output<String> joinedTimestamp) {
            this.joinedTimestamp = joinedTimestamp;
            return this;
        }

        public Builder joinedTimestamp(@Nullable String joinedTimestamp) {
            this.joinedTimestamp = Output.ofNullable(joinedTimestamp);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder servicePrincipal(@Nullable Output<String> servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }

        public Builder servicePrincipal(@Nullable String servicePrincipal) {
            this.servicePrincipal = Output.ofNullable(servicePrincipal);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public DelegatedAdministratorState build() {
            return new DelegatedAdministratorState(accountId, arn, delegationEnabledDate, email, joinedMethod, joinedTimestamp, name, servicePrincipal, status);
        }
    }
}
