// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessReviewInstanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccessReviewInstanceResponse Empty = new AccessReviewInstanceResponse();

    @InputImport(name="endDateTime")
    private final @Nullable String endDateTime;

    public Optional<String> getEndDateTime() {
        return this.endDateTime == null ? Optional.empty() : Optional.ofNullable(this.endDateTime);
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="startDateTime")
    private final @Nullable String startDateTime;

    public Optional<String> getStartDateTime() {
        return this.startDateTime == null ? Optional.empty() : Optional.ofNullable(this.startDateTime);
    }

    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AccessReviewInstanceResponse(
        @Nullable String endDateTime,
        String id,
        String name,
        @Nullable String startDateTime,
        String status,
        String type) {
        this.endDateTime = endDateTime;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.startDateTime = startDateTime;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AccessReviewInstanceResponse() {
        this.endDateTime = null;
        this.id = null;
        this.name = null;
        this.startDateTime = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endDateTime;
        private String id;
        private String name;
        private @Nullable String startDateTime;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDateTime = defaults.endDateTime;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startDateTime = defaults.startDateTime;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setEndDateTime(@Nullable String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStartDateTime(@Nullable String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AccessReviewInstanceResponse build() {
            return new AccessReviewInstanceResponse(endDateTime, id, name, startDateTime, status, type);
        }
    }
}
