// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingAccountExclusionState extends io.pulumi.resources.ResourceArgs {

    public static final BillingAccountExclusionState Empty = new BillingAccountExclusionState();

    /**
     * The billing account to create the exclusion for.
     * 
     */
    @Import(name="billingAccount")
      private final @Nullable Output<String> billingAccount;

    public Output<String> getBillingAccount() {
        return this.billingAccount == null ? Codegen.empty() : this.billingAccount;
    }

    /**
     * A human-readable description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * The name of the logging exclusion.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public BillingAccountExclusionState(
        @Nullable Output<String> billingAccount,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<String> filter,
        @Nullable Output<String> name) {
        this.billingAccount = billingAccount;
        this.description = description;
        this.disabled = disabled;
        this.filter = filter;
        this.name = name;
    }

    private BillingAccountExclusionState() {
        this.billingAccount = Codegen.empty();
        this.description = Codegen.empty();
        this.disabled = Codegen.empty();
        this.filter = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountExclusionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> billingAccount;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<String> filter;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountExclusionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccount = defaults.billingAccount;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
        }

        public Builder billingAccount(@Nullable Output<String> billingAccount) {
            this.billingAccount = billingAccount;
            return this;
        }
        public Builder billingAccount(@Nullable String billingAccount) {
            this.billingAccount = Codegen.ofNullable(billingAccount);
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
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public BillingAccountExclusionState build() {
            return new BillingAccountExclusionState(billingAccount, description, disabled, filter, name);
        }
    }
}
