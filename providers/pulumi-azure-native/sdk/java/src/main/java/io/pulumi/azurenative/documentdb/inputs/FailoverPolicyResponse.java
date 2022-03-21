// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The failover policy for a given region of a database account.
 * 
 */
public final class FailoverPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final FailoverPolicyResponse Empty = new FailoverPolicyResponse();

    /**
     * The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
     */
    @Import(name="failoverPriority")
      private final @Nullable Integer failoverPriority;

    public Optional<Integer> getFailoverPriority() {
        return this.failoverPriority == null ? Optional.empty() : Optional.ofNullable(this.failoverPriority);
    }

    /**
     * The unique identifier of the region in which the database account replicates to. Example: &lt;accountName&gt;-&lt;locationName&gt;.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The name of the region in which the database account exists.
     * 
     */
    @Import(name="locationName")
      private final @Nullable String locationName;

    public Optional<String> getLocationName() {
        return this.locationName == null ? Optional.empty() : Optional.ofNullable(this.locationName);
    }

    public FailoverPolicyResponse(
        @Nullable Integer failoverPriority,
        String id,
        @Nullable String locationName) {
        this.failoverPriority = failoverPriority;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.locationName = locationName;
    }

    private FailoverPolicyResponse() {
        this.failoverPriority = null;
        this.id = null;
        this.locationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failoverPriority;
        private String id;
        private @Nullable String locationName;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPriority = defaults.failoverPriority;
    	      this.id = defaults.id;
    	      this.locationName = defaults.locationName;
        }

        public Builder failoverPriority(@Nullable Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder locationName(@Nullable String locationName) {
            this.locationName = locationName;
            return this;
        }        public FailoverPolicyResponse build() {
            return new FailoverPolicyResponse(failoverPriority, id, locationName);
        }
    }
}
