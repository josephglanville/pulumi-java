// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.DbSystemIormConfigCachDbPlan;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DbSystemIormConfigCach {
    /**
     * @return An array of IORM settings for all the database in the Exadata DB system.
     * 
     */
    private final @Nullable List<DbSystemIormConfigCachDbPlan> dbPlans;
    private final @Nullable String dbSystemId;
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    private final @Nullable String lifecycleDetails;
    /**
     * @return The current value for the IORM objective. The default is `AUTO`.
     * 
     */
    private final @Nullable String objective;
    /**
     * @return The current state of the DB system.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private DbSystemIormConfigCach(
        @CustomType.Parameter("dbPlans") @Nullable List<DbSystemIormConfigCachDbPlan> dbPlans,
        @CustomType.Parameter("dbSystemId") @Nullable String dbSystemId,
        @CustomType.Parameter("lifecycleDetails") @Nullable String lifecycleDetails,
        @CustomType.Parameter("objective") @Nullable String objective,
        @CustomType.Parameter("state") @Nullable String state) {
        this.dbPlans = dbPlans;
        this.dbSystemId = dbSystemId;
        this.lifecycleDetails = lifecycleDetails;
        this.objective = objective;
        this.state = state;
    }

    /**
     * @return An array of IORM settings for all the database in the Exadata DB system.
     * 
     */
    public List<DbSystemIormConfigCachDbPlan> dbPlans() {
        return this.dbPlans == null ? List.of() : this.dbPlans;
    }
    public Optional<String> dbSystemId() {
        return Optional.ofNullable(this.dbSystemId);
    }
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public Optional<String> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }
    /**
     * @return The current value for the IORM objective. The default is `AUTO`.
     * 
     */
    public Optional<String> objective() {
        return Optional.ofNullable(this.objective);
    }
    /**
     * @return The current state of the DB system.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DbSystemIormConfigCach defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DbSystemIormConfigCachDbPlan> dbPlans;
        private @Nullable String dbSystemId;
        private @Nullable String lifecycleDetails;
        private @Nullable String objective;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(DbSystemIormConfigCach defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbPlans = defaults.dbPlans;
    	      this.dbSystemId = defaults.dbSystemId;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.objective = defaults.objective;
    	      this.state = defaults.state;
        }

        public Builder dbPlans(@Nullable List<DbSystemIormConfigCachDbPlan> dbPlans) {
            this.dbPlans = dbPlans;
            return this;
        }
        public Builder dbPlans(DbSystemIormConfigCachDbPlan... dbPlans) {
            return dbPlans(List.of(dbPlans));
        }
        public Builder dbSystemId(@Nullable String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }
        public Builder lifecycleDetails(@Nullable String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            return this;
        }
        public Builder objective(@Nullable String objective) {
            this.objective = objective;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public DbSystemIormConfigCach build() {
            return new DbSystemIormConfigCach(dbPlans, dbSystemId, lifecycleDetails, objective, state);
        }
    }
}
