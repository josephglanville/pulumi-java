// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificateResult {
    /**
     * Amazon Resource Name (ARN) of the found certificate, suitable for referencing in other resources that support ACM certificates.
     * 
     */
    private final String arn;
    private final String domain;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable List<String> keyTypes;
    private final @Nullable Boolean mostRecent;
    /**
     * Status of the found certificate.
     * 
     */
    private final String status;
    private final @Nullable List<String> statuses;
    /**
     * A mapping of tags for the resource.
     * 
     */
    private final Map<String,String> tags;
    private final @Nullable List<String> types;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyTypes") @Nullable List<String> keyTypes,
        @CustomType.Parameter("mostRecent") @Nullable Boolean mostRecent,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statuses") @Nullable List<String> statuses,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("types") @Nullable List<String> types) {
        this.arn = arn;
        this.domain = domain;
        this.id = id;
        this.keyTypes = keyTypes;
        this.mostRecent = mostRecent;
        this.status = status;
        this.statuses = statuses;
        this.tags = tags;
        this.types = types;
    }

    /**
     * Amazon Resource Name (ARN) of the found certificate, suitable for referencing in other resources that support ACM certificates.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    public String getDomain() {
        return this.domain;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<String> getKeyTypes() {
        return this.keyTypes == null ? List.of() : this.keyTypes;
    }
    public Optional<Boolean> getMostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * Status of the found certificate.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    public List<String> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * A mapping of tags for the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    public List<String> getTypes() {
        return this.types == null ? List.of() : this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String domain;
        private String id;
        private @Nullable List<String> keyTypes;
        private @Nullable Boolean mostRecent;
        private String status;
        private @Nullable List<String> statuses;
        private Map<String,String> tags;
        private @Nullable List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domain = defaults.domain;
    	      this.id = defaults.id;
    	      this.keyTypes = defaults.keyTypes;
    	      this.mostRecent = defaults.mostRecent;
    	      this.status = defaults.status;
    	      this.statuses = defaults.statuses;
    	      this.tags = defaults.tags;
    	      this.types = defaults.types;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyTypes(@Nullable List<String> keyTypes) {
            this.keyTypes = keyTypes;
            return this;
        }
        public Builder keyTypes(String... keyTypes) {
            return keyTypes(List.of(keyTypes));
        }
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statuses(@Nullable List<String> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder types(@Nullable List<String> types) {
            this.types = types;
            return this;
        }
        public Builder types(String... types) {
            return types(List.of(types));
        }        public GetCertificateResult build() {
            return new GetCertificateResult(arn, domain, id, keyTypes, mostRecent, status, statuses, tags, types);
        }
    }
}