// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateSigningRequestSpec {
    private final @Nullable Integer expirationSeconds;
    private final @Nullable Map<String,List<String>> extra;
    private final @Nullable List<String> groups;
    private final String request;
    private final String signerName;
    private final @Nullable String uid;
    private final @Nullable List<String> usages;
    private final @Nullable String username;

    @OutputCustomType.Constructor({"expirationSeconds","extra","groups","request","signerName","uid","usages","username"})
    private CertificateSigningRequestSpec(
        @Nullable Integer expirationSeconds,
        @Nullable Map<String,List<String>> extra,
        @Nullable List<String> groups,
        String request,
        String signerName,
        @Nullable String uid,
        @Nullable List<String> usages,
        @Nullable String username) {
        this.expirationSeconds = expirationSeconds;
        this.extra = extra;
        this.groups = groups;
        this.request = Objects.requireNonNull(request);
        this.signerName = Objects.requireNonNull(signerName);
        this.uid = uid;
        this.usages = usages;
        this.username = username;
    }

    public Optional<Integer> getExpirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }
    public Map<String,List<String>> getExtra() {
        return this.extra == null ? Map.of() : this.extra;
    }
    public List<String> getGroups() {
        return this.groups == null ? List.of() : this.groups;
    }
    public String getRequest() {
        return this.request;
    }
    public String getSignerName() {
        return this.signerName;
    }
    public Optional<String> getUid() {
        return Optional.ofNullable(this.uid);
    }
    public List<String> getUsages() {
        return this.usages == null ? List.of() : this.usages;
    }
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer expirationSeconds;
        private @Nullable Map<String,List<String>> extra;
        private @Nullable List<String> groups;
        private String request;
        private String signerName;
        private @Nullable String uid;
        private @Nullable List<String> usages;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationSeconds = defaults.expirationSeconds;
    	      this.extra = defaults.extra;
    	      this.groups = defaults.groups;
    	      this.request = defaults.request;
    	      this.signerName = defaults.signerName;
    	      this.uid = defaults.uid;
    	      this.usages = defaults.usages;
    	      this.username = defaults.username;
        }

        public Builder setExpirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        public Builder setExtra(@Nullable Map<String,List<String>> extra) {
            this.extra = extra;
            return this;
        }

        public Builder setGroups(@Nullable List<String> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setRequest(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }

        public Builder setSignerName(String signerName) {
            this.signerName = Objects.requireNonNull(signerName);
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUsages(@Nullable List<String> usages) {
            this.usages = usages;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public CertificateSigningRequestSpec build() {
            return new CertificateSigningRequestSpec(expirationSeconds, extra, groups, request, signerName, uid, usages, username);
        }
    }
}
