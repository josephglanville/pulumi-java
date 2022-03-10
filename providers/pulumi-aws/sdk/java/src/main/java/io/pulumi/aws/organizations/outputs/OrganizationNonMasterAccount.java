// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OrganizationNonMasterAccount {
    /**
     * ARN of the root
     * 
     */
    private final @Nullable String arn;
    /**
     * Email of the account
     * 
     */
    private final @Nullable String email;
    /**
     * Identifier of the root
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the policy type
     * 
     */
    private final @Nullable String name;
    /**
     * The status of the policy type as it relates to the associated root
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor
    private OrganizationNonMasterAccount(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("email") @Nullable String email,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("status") @Nullable String status) {
        this.arn = arn;
        this.email = email;
        this.id = id;
        this.name = name;
        this.status = status;
    }

    /**
     * ARN of the root
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Email of the account
     * 
    */
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * Identifier of the root
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the policy type
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The status of the policy type as it relates to the associated root
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationNonMasterAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String email;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationNonMasterAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public OrganizationNonMasterAccount build() {
            return new OrganizationNonMasterAccount(arn, email, id, name, status);
        }
    }
}
