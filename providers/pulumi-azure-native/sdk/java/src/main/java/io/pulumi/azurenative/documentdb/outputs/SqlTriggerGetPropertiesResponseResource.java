// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlTriggerGetPropertiesResponseResource {
    private final @Nullable String body;
    private final String etag;
    private final String id;
    private final String rid;
    private final @Nullable String triggerOperation;
    private final @Nullable String triggerType;
    private final Double ts;

    @OutputCustomType.Constructor({"body","etag","id","rid","triggerOperation","triggerType","ts"})
    private SqlTriggerGetPropertiesResponseResource(
        @Nullable String body,
        String etag,
        String id,
        String rid,
        @Nullable String triggerOperation,
        @Nullable String triggerType,
        Double ts) {
        this.body = body;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.rid = Objects.requireNonNull(rid);
        this.triggerOperation = triggerOperation;
        this.triggerType = triggerType;
        this.ts = Objects.requireNonNull(ts);
    }

    public Optional<String> getBody() {
        return Optional.ofNullable(this.body);
    }
    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public String getRid() {
        return this.rid;
    }
    public Optional<String> getTriggerOperation() {
        return Optional.ofNullable(this.triggerOperation);
    }
    public Optional<String> getTriggerType() {
        return Optional.ofNullable(this.triggerType);
    }
    public Double getTs() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlTriggerGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String body;
        private String etag;
        private String id;
        private String rid;
        private @Nullable String triggerOperation;
        private @Nullable String triggerType;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlTriggerGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.triggerOperation = defaults.triggerOperation;
    	      this.triggerType = defaults.triggerType;
    	      this.ts = defaults.ts;
        }

        public Builder setBody(@Nullable String body) {
            this.body = body;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setRid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }

        public Builder setTriggerOperation(@Nullable String triggerOperation) {
            this.triggerOperation = triggerOperation;
            return this;
        }

        public Builder setTriggerType(@Nullable String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public Builder setTs(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }

        public SqlTriggerGetPropertiesResponseResource build() {
            return new SqlTriggerGetPropertiesResponseResource(body, etag, id, rid, triggerOperation, triggerType, ts);
        }
    }
}
