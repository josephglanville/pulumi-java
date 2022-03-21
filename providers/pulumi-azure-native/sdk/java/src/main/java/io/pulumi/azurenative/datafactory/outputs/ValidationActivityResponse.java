// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ValidationActivityResponse {
    /**
     * Can be used if dataset points to a folder. If set to true, the folder must have at least one file. If set to false, the folder must be empty. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object childItems;
    /**
     * Validation activity dataset reference.
     * 
     */
    private final DatasetReferenceResponse dataset;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Can be used if dataset points to a file. The file must be greater than or equal in size to the value specified. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object minimumSize;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * A delay in seconds between validation attempts. If no value is specified, 10 seconds will be used as the default. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sleep;
    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object timeout;
    /**
     * Type of activity.
     * Expected value is 'Validation'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private ValidationActivityResponse(
        @CustomType.Parameter("childItems") @Nullable Object childItems,
        @CustomType.Parameter("dataset") DatasetReferenceResponse dataset,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("minimumSize") @Nullable Object minimumSize,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sleep") @Nullable Object sleep,
        @CustomType.Parameter("timeout") @Nullable Object timeout,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.childItems = childItems;
        this.dataset = dataset;
        this.dependsOn = dependsOn;
        this.description = description;
        this.minimumSize = minimumSize;
        this.name = name;
        this.sleep = sleep;
        this.timeout = timeout;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * Can be used if dataset points to a folder. If set to true, the folder must have at least one file. If set to false, the folder must be empty. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getChildItems() {
        return Optional.ofNullable(this.childItems);
    }
    /**
     * Validation activity dataset reference.
     * 
    */
    public DatasetReferenceResponse getDataset() {
        return this.dataset;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Can be used if dataset points to a file. The file must be greater than or equal in size to the value specified. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMinimumSize() {
        return Optional.ofNullable(this.minimumSize);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A delay in seconds between validation attempts. If no value is specified, 10 seconds will be used as the default. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSleep() {
        return Optional.ofNullable(this.sleep);
    }
    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Type of activity.
     * Expected value is 'Validation'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object childItems;
        private DatasetReferenceResponse dataset;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object minimumSize;
        private String name;
        private @Nullable Object sleep;
        private @Nullable Object timeout;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childItems = defaults.childItems;
    	      this.dataset = defaults.dataset;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.minimumSize = defaults.minimumSize;
    	      this.name = defaults.name;
    	      this.sleep = defaults.sleep;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder childItems(@Nullable Object childItems) {
            this.childItems = childItems;
            return this;
        }
        public Builder dataset(DatasetReferenceResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder minimumSize(@Nullable Object minimumSize) {
            this.minimumSize = minimumSize;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sleep(@Nullable Object sleep) {
            this.sleep = sleep;
            return this;
        }
        public Builder timeout(@Nullable Object timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public ValidationActivityResponse build() {
            return new ValidationActivityResponse(childItems, dataset, dependsOn, description, minimumSize, name, sleep, timeout, type, userProperties);
        }
    }
}
